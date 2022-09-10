package containerWithMostWater11;

public class Solution {
    public int maxArea(int[] height) {


        int len= height.length;
        int b=height[0];
        int e=height[len-1];
        int c=e;
        if (b>e){
            c=e;

        }
        else c=b;
        int container=c *len;
        int i=1;
        int check=0;
        while (true){

            if (b==c){
                b=height[i];
                i++;
            }
            else {
                len--;
                e=height[len-1];
            }
            if (b>e){
                c=e;

            }
            else c=b;
            if (container<e*len ){
                check++;
            }
            if (check==2){
                break;
            }




        }
        return container;
        }
    }
