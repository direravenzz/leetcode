package minimumSumOfFourDigitNumberAfterSplittingDigits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Solution solution=new Solution();
        System.out.println(solution.minimumSum(3214));
    }
}
class Solution {
    ArrayList<Integer>arrayList=new ArrayList<>();
    public int minimumSum(int num) {
        for (int i = 0; i < 4; i++) {
            arrayList.add(num%10);
            num/=10;
        }
        Collections.sort(arrayList);
        int result=arrayList.get(0)+arrayList.get(1);
        result*=10;
        result+= arrayList.get(2)+ arrayList.get(3);
        return result;

    }
}
