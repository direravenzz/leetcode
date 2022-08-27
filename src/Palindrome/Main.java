package Palindrome;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        int f=0;

        ArrayList<Integer> arrayList=new ArrayList<>();
        if (num<0){
            f++;
        }
        else {
            while (num!=0){
                int b=num%10;
                arrayList.add(b);
                num-=b;
                num/=10;

            }

            int size =arrayList.size()-1;
            int length= size/2;

            for (int i = 0; i < length+1; i++) {
                int a= arrayList.get(i);
                int b= arrayList.get(size-i);
                if (a!=b){
                    f++;
                }
            }

        }if (f>0){
            System.out.println("false");
        }
        else System.out.println("true");
        }
}
