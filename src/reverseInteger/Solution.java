package reverseInteger;

public class Solution {
    public int reverse(int x) {
        boolean flag= false;
        if (x<0){
            x*=-1;
            flag=true;
        }


        int num=x;
        int length=String.valueOf(x).length();
        int[] add=new int[length/2];
        int div= (int) Math.pow(10,length-1);
        for (int i = 1; i <length/2+1 ; i++) {

            int a=(x%10);


            int b=(x/div);
            add[i-1]=a+b;
            x%=div;
            x/=10;
            div/=100;

            
        }
        if (length%2==1){

            x *= Math.pow(10,length/2);
        }else {
            x=0;
        }
        div= (int) Math.pow(10,length-1);
        for (int i = 0; i < length / 2 ; i++) {
            int add_i=add[i];
            int n=add_i-num%10;
            if (i==0){
                x+=n;
            }else {
                x+=n*Math.pow(10,i);
            }
            add_i-=n;
            double c=10;
            for (int j = 0; j < length - 1 - i; j++) {
                c*=10;
            }
            System.out.println(c);
            x+=add_i*c;

            num/=10;
            div/=10;
        }



        if (flag) x*=-1;
        return x;
    }
}