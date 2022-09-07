package zigzagConversion;

    public class Solution2 {
        String a="";
        public String convert(String s, int numRows) {

            if (s.length()<2 || numRows==1){
                return s;
            }
            for (int i = 0; i < numRows; i++) {
                if (i<s.length()) {
                    a += String.valueOf(s.charAt(i));
                }else return a;
                int check = numRows * 2 - 2 + i;

                while (true) {
                    if (i == 0 || i == numRows - 1) {
                        if (check<s.length()) {
                            a += s.charAt(check);
                        }else break;
                        check += numRows * 2 - 2;
                    } else {
                        int check2 = check - 2 * i;
                        if (check2 < s.length()) {
                            a += s.charAt(check2);
                        }
                        if (check < s.length()) {
                            a += s.charAt(check);
                            check += numRows * 2 - 2;

                        }
                        else break;
                    }
                }
            }


            return a;


        }
    }


