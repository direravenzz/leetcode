package twoSum;

public class Main {
    public static void main(String[] args) {

        int[] a={3,2,3};

        TwoSum twoSum=new TwoSum();

        int i = 6;
        int[] b= twoSum.twoSum(a, i);
        System.out.println(b[0]+"  "+b[1]);
    }
}
