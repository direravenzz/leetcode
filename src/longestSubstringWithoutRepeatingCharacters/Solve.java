package longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solve {
    public int lengthOfLongestSubstring(String s) {

        int b=0;
        int e=0;
        int res=0;
        HashMap map=new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char a=s.charAt(i);
            if (map.containsKey(a)){
                e=i;
                if (e-b>res) {
                    res = e - b;
                }
                b= (int) map.get(a)+1;
                i=b-1;
                map=new HashMap();


            }
            else {
                map.put(a, i);
            }
            if (map.size()>res){
                res= map.size();
            }

        }
        return res;

    }
}
