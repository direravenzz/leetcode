package Palindrome;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if (num<0){
            System.out.println("false");
        }
        else {
            int length = (int) Math.log10(num) + 1;
            int sub = 0;
            int secNum;
            int odd = length % 2;
            if (length % 2 == 1) {
                secNum = (length + 1) / 2;
            } else secNum = length / 2;
            for (int i = 0; i < secNum; i++) {
                int b = num % 10;
                sub += (int) (b * (Math.pow(10, secNum - i - 1)));
                num -= b;
                num /= 10;

            }
            if (odd == 1) {
                int b = sub % 10;
                sub -= b;
                sub /= 10;
            }
            System.out.println(sub==num);
        }
    }
}
