package longestPalindromicSubstring;

public class SolutionSec {
    public String longestPalindrome(String s) {


        if(s.length()<2){
            return s;
        }
        else if (s.length()==2){
            if (s.charAt(0)==s.charAt(1)){
                return s;
            }
            else return String.valueOf(s.charAt(0));
        }
        char b;
        char e;
        int track=0;
        int checkRes = 0;
        String result="";
        int ideal = s.length()+1;
        int res = 0;
        while (res < ideal) {
            ideal--;
            if (s.length() % 2 == 0) {
                if (ideal == s.length()) {
                    int counter=0;
                    for (int i = 0; i < ideal / 2; i++) {
                        b=s.charAt(ideal / 2 - 1 - i );
                        e=s.charAt(ideal / 2 + i);
                        if (e== b) {
                            counter++;

                        }
                        else break;


                    }
                    if (counter > 0) {
                        res = counter * 2;
                        result = s.substring(ideal / 2  - counter, ideal / 2 + counter);
                    }
                }else if (ideal%2==1){


                    String result1=checkOdd(s.length(),ideal,s,res,0);
                    if (result1.length()>res) {

                        result=result1;

                        res = result.length();
                    }
                } else if (ideal % 2 == 0) {

                    String result1=checkEven(ideal,s,res);
                    if (result1.length()>res) {

                        result=result1;

                        res = result.length();
                    }
                    }
                }
                else {
                if (ideal == s.length()) {
                    int counter=0;
                    for (int i = 0; i < ideal / 2; i++) {
                        b=s.charAt(ideal / 2 - 1 - i);
                        e=s.charAt(ideal / 2 + 1 + i);
                        if (b==e ) {
                            counter++;

                        }else {
                            break;
                        }

                    }
                    if (counter > 0) {

                        res = counter * 2 + 1;
                        result = s.substring(ideal / 2  - counter, ideal / 2 + 1 + counter);

                    }
                }
                else if (ideal%2==1){


                    String result1=checkOdd(s.length()-1,ideal,s,res,1);
                    if (result1.length()>res) {

                        result=result1;

                        res = result.length();
                    }
                } else if (ideal % 2 == 0) {

                    String result1=checkEven(ideal,s,res);
                    if (result1.length()>res) {

                        result=result1;

                        res = result.length();
                    }
                }
            }
            }
        return result;
    }
    public String  checkOdd(int size, int ideal,String s, int res, int plus){
        String result = "";
        int counter=0;
        int track = size/2 - ideal/2;
        int checkRes=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < ideal / 2+1; j++) {
                char b=s.charAt(size / 2 -1 - j + track+plus );
                char e=s.charAt(size / 2-1 + j + track +plus  );
                if ( b==e ) {
                    counter++;

                }
                else break;

            }
            if (counter>0) {
                checkRes = counter * 2 + 1;
            }
            if (checkRes > res ) {
                res = checkRes;
                if (size%2==0){
                    result = s.substring(size / 2  - counter + track+plus -1 , size / 2-1 + counter + track +plus+1 );

                }else {
                    result = s.substring(size / 2  - counter  + track + plus, size / 2 - 1 + counter + track + plus);
                }
            }


            plus=0;
            counter=0;
            track *= -1;
            track++;


        }
        return result;
    }
    public String checkEven(int ideal,String s ,int res) {


        int counter = 0;
        int track = ideal/2 ;

        String result="";
        for (int j = 0; j < 2; j++) {



            for (int i = 0; i < ideal / 2; i++) {
                char b = s.charAt( track-1-i);
                char e = s.charAt( track +i);
                if (e == b) {
                    counter++;

                }
                else break;


            }
            int ch=counter*2;
            if (ch > res) {
                res = counter * 2;
                result = s.substring(track-counter, track+counter);
            }

            counter=0;

            track=s.length()-track;


        }
        if (result.equals("")){
            result= String.valueOf(s.charAt(0));
        }
        return result;
    }
}
