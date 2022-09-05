package longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Solve solve=new Solve();
        System.out.println(solve.lengthOfLongestSubstring("asdf"));
        System.out.println(solve.lengthOfLongestSubstring("asdwsd"));
        System.out.println(solve.lengthOfLongestSubstring("dwde"));
        System.out.println(solve.lengthOfLongestSubstring("aaaaaaa"));


        System.out.println(solve.lengthOfLongestSubstring("abcavbncbb"));

    }
}
