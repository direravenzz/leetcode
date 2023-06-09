package catAndMouse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] catMouseGame=        {{5,6},{4},{6},{6},{1,7},{4,0},{0,2,3,7},{4,6}};

        int [][ ] catMouse=        {{2,5},{3},{0,4,5},{1,4,5},{2,3},{0,2,3}};
        int [][] cM1={{5},{4},{6},{4,6},{1,3,5},{4,0}};
        solution.catMouseGame(catMouseGame);
        solution.catMouseGame(catMouse);
        solution.catMouseGame(cM1);
    }
}
class Solution {
    public int mouseWin(int[][] graph){

        Set<Integer> set=new HashSet<>();
        set.add(0);
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        for (int a :
                graph[0]) {
            set.add(a);
            arrayList.add(a);
        }
        int count=0;

        for (int i = 0; i < graph[0].length; i++) {

            for (int a  :
                    arrayList) {

                while (true) {
                    if (set.contains(2)) {
                        count++;
                        break;
                    }
                    if (set.contains(1)) {
                        return 1;
                    }

                    for (int b :
                            graph[a]) {
                        if (!set.contains(b)) {
                            set.add(b);
                            arrayList1.add(b);
                        }


                    }
                }
            }
            arrayList=arrayList1;
            arrayList1=new ArrayList<>();


        }
        return 0;
    }
    public int draw(int[][] graph){
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        int root=1;
        int countMouse=0;
        int countCat=0;
        while (true) {

            if (graph[root].length == 1) {

                root=graph[root][0];
                countMouse++;
            }
            else break;

            set.add(root);
        }
        if (set.contains(2)){
            return 2;
        }
        while (!set.contains(2))
            for (int a :
                    graph[root]) {
                if (set1.contains(a)){
                    set1.remove(a);
                }
                if (set.contains(a)){
                    countCat++;
                }
                set1.add(a);
                set.add(a);
            }

        return 2;
    }
    public int catMouseGame(int[][] graph) {


        int result=mouseWin(graph);
        result=mouseWin(graph);
        result=draw(graph);
        return result;
    }
}