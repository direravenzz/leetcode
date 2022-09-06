package longestPalindromicSubstring;

import java.util.HashMap;

public class Solution {
    public String longestPalindrome(String s) {


        if(s.length()<2){
            return s;
        }
        char b;
        char e;
        int track=0;
        int checkRes = 0;
        String result="";
        int ideal = s.length()+1;
        int res = 0;
        int counter = 0;
        while (res < ideal) {
            ideal--;
            counter = 0;
            if (s.length() % 2 == 0) {
                if (ideal == s.length()) {
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
                    counter=1;
                    track = s.length()/2 - ideal/2;

                    for (int i = 0; i < 2; i++) {
                        for (int j = 1; j < ideal / 2+1; j++) {
                            b=s.charAt(s.length() / 2 -1 - j + track );
                            e=s.charAt(s.length() / 2-1 + j + track   );
                            if ( b==e ) {
                                counter++;

                            }
                            else break;

                        }
                        checkRes = counter * 2-1;
                        if (checkRes >= res ) {
                            res = checkRes;
                            result = s.substring(s.length() / 2  - counter  + track , s.length() / 2 + counter  + track -1);

                        }


                        counter=0;
                        track *= -1;
                        track++;


                    }


                } else if (ideal % 2 == 0) {

                    counter = 0;
                    track = ideal/2 ;

                    for (int j = 0; j < 2; j++) {



                        for (int i = 0; i < ideal / 2; i++) {
                            b = s.charAt( track-1);
                            e = s.charAt( track );
                            if (e == b) {
                                counter++;

                            } else break;


                        }
                        if (counter > 0) {
                            res = counter * 2;
                            result = s.substring(ideal / 2 - counter, ideal / 2 + counter);
                        }

                        counter=0;

                        track=s.length()-track;


                    }
                }
            }
            else {
                if (ideal == s.length()) {
                    for (int i = 0; i < ideal / 2; i++) {
                        b=s.charAt(ideal / 2 - 1 - i);
                        e=s.charAt(ideal / 2 + 1 + i);
                        if (b==e ) {
                            counter++;

                        }


                    }
                    if (counter > 0) {

                        res = counter * 2 + 1;
                        result = s.substring(ideal / 2  - counter, ideal / 2 + 1 + counter);

                    }
                }else if (ideal<s.length()){
                    track = s.length() - ideal;

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < ideal / 2; j++) {
                            b=s.charAt(s.length() / 2 - 1 - j + track );
                            e=s.charAt(s.length() / 2 + 1+j + track);
                            if (b==e ) {
                                counter++;

                            }
                            checkRes = counter * 2;
                            if (checkRes >= res ) {
                                res = checkRes;
                                result = s.substring(s.length() / 2 - counter + track, s.length()/ 2 + counter + track);

                            }


                            track *= -1;
                        }


                    }


                }

            }
        }
        if (result==""){
            return s.substring(0,1);
        }
        return result;
    }
}


