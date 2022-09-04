package isomorphic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        HashMap<Character, Character> hashMap=new HashMap<>();
        if (a.length()==b.length()){
            for (int i = 0; i < a.length(); i++) {

                char f=a.charAt(i);
                char s=b.charAt(i);
                if (hashMap.containsKey(f)){
                if ( hashMap.get(f)!=s) {
                    System.out.println(false);




                }}

                hashMap.put(f,s);


            }

            Set<Object> uniqueValues = new HashSet<Object>(hashMap.values());
            if (hashMap.values().size()==uniqueValues.size()){
                System.out.println(true );

            }
            else System.out.println(false);



        }
    }
}
