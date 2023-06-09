package longestHappyString;

public class Sulotion {



    public String longestDiverseString(int a, int b, int c){

        String answer="";
        while (a+b+c>0) {
            if (answer.endsWith("aa")){
                if (b>c){
                    answer+="b";
                    b--;
                }else if (c>=b&&c>0){
                    answer+="c";
                    c--;
                }
                else return answer;
            }else if (answer.endsWith("bb")){
                if (a>c){
                    answer+="a";
                    a--;
                }else if (c>=a&&c>0){
                    answer+="c";
                    c--;
                }
                else return answer;
            }else if (answer.endsWith("cc")){
                if (a>b){
                    answer+="a";
                    a--;
                }else if (b>=a&&b>0){
                    answer+="b";
                    b--;
                }
                else return answer;
            }
            int d=Math.max(a, Math.max(b, c));
            if (d==a){
                answer+="a";
                a--;
            }
            else if (d==b){
                answer+="b";
                b--;
            }
            else if (d==c&&!answer.endsWith("cc")){
                answer+="c";
                c--;
            }
        }
        return answer;

    }
}
