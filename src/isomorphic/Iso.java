package isomorphic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Iso {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        HashMap<Character,Character> hashMap1=new HashMap<>();
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {

                char f = s.charAt(i);
                char h = t.charAt(i);
                if (hashMap.containsKey(f)&&hashMap.get(f)!=h){
                    return false;
                }


                hashMap1.put(h,f);
                hashMap.put(f, h);


            }

            if (hashMap.values().size() == hashMap1.values().size()) {
                return true;

            }
            return false;


        }
        return true;
    }
}



