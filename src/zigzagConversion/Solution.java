package zigzagConversion;

public class Solution {
    String a="";
    public String gap(int num){
        String re="";
        for (int j = 0; j < num; j++) {
            re+=" ";
        }
        return re;
    }
    public String convert(String s, int numRows) {

        for (int i = 0; i < numRows; i++) {
            a += String.valueOf(s.charAt(i));
            String gap = gap(numRows - 2 - i);
            a += gap;
            if (i == 3) {
                gap = gap(numRows - 2);
                a += gap;
            }
            int check = numRows * 2 - 2 + i;

            while (true) {
                if (i == 0 || i == numRows - 1) {
                    if (check<s.length()) {
                        a += s.charAt(check);
                        a += gap(numRows - 2);
                    }else break;
                    check += numRows * 2 - 2;


                } else {

                    int check2 = check - 2 * i;
                    if (check2 < s.length()) {
                        a += s.charAt(check2);

                        a += gap(i - 1);
                    }
                    if (check < s.length()) {
                        a += s.charAt(check);
                        a += gap(numRows - 2 - i);
                        check += numRows * 2 - 2;

                    }
                    else break;



                }
            }
            a += "\n";
        }


        return a;


    }
}
