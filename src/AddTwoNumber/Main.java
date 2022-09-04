package AddTwoNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ListNode listNode=new ListNode();

        ListNode listNode1=new ListNode();


        ListNode head;
        ListNode head1;
        int a=1;
        int b=scanner.nextInt();
        int lv=scanner.nextInt();
        head=new ListNode(lv);

        listNode= head;

        while (a< b){
            listNode.next=new ListNode(scanner.nextInt());
            listNode= listNode.next;
            a++;
        }

        a=1;
        int lv1=scanner.nextInt();
        head1=new ListNode(lv1);

        listNode1= head1;

        while (a< b){
            listNode1.next=new ListNode(scanner.nextInt());
            listNode1= listNode1.next;
            a++;
        }
        ListNode listNode2=head;
//        System.out.println(listNode2.val);
//
//        while (listNode2.next!=null){
//            listNode2= listNode2.next;
//            System.out.println(listNode2.val);
//
//        }
//        System.out.println("////");
        ListNode listNode3=head1;
//        System.out.println(listNode3.val);
//        while (listNode3.next!=null){
//            listNode3= listNode3.next;
//            System.out.println(listNode3.val);
//        }
        Node node=new Node();
        ListNode listNode4=node.addTwoNumbers(listNode2,listNode3);
        System.out.println(listNode4.val);
        while (listNode4.next!=null){
            listNode4= listNode4.next;
            System.out.println(listNode4.val);
        }
    }

}
