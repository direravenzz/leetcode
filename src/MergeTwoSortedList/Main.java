package MergeTwoSortedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        SortedList sortedList=new SortedList();
        SortedList sortedList1=sortedList;
        int a=1;
        if (a ==1){
            int val =scanner.nextInt();
            sortedList.val=val;
            a--;
        }
        while (a==0){
            try {
                int next=scanner.nextInt();
                sortedList.next=new SortedList(next );
                sortedList=sortedList.next;


            }
            catch (Exception e){
                a--;
            }
        }
        int val= sortedList1.val;
        int ab=0;
        while (ab==0 )
        {
//            sortedList1=SortedList ;
        }


//
//        int counter_a=0;
//        int counter_b=0;
//
//
//
//        int counter_sum=0;
//
//        int first = 0;
//
//        if (a[counter_a]<=b[counter_b]) {
//            sortedList.val=b[counter_b];
//            counter_b++;
//            first=b[counter_b];
//
//
//        } else if (a[counter_a]>b[counter_b]) {
//            sortedList.val=a[counter_a];
//            counter_a++;
//            first=a[counter_a];
//        }
//
//
//
//        if (a[counter_a]<=b[counter_b]) {
//            SortedList list=new SortedList(b[counter_b]);
//            sortedList.next=list;
//            counter_b++;
//
//
//
//        } else if (a[counter_a]>b[counter_b]) {
//            SortedList list=new SortedList(a[counter_a]);
//            sortedList.next=list;
//            counter_a++;
//
//
//        }
//        while (sortedList.next== null){
//            System.out.println(sortedList.val);
//            sortedList=sortedList.next;

        }
    }


