package AddTwoNumber;

public class Node {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int a= l1.val, b= l2.val,plus=0,c=0;
        c=(a+b)%10;
        if (a+b>=10){
            plus++;
        }
        ListNode head=new ListNode(c);
        ListNode l3=head;

        while (l1.next!=null||l2.next!=null){

            if (l1.next!=null){

                l1=l1.next;
                a=l1.val;

            }
            else a=0;
            if (l2.next!=null){
                l2=l2.next;
                b=l2.val;

            }
            else b=0;

            int check=a+b;
            if (check>=10)
            {
                if (plus==1){

                    check++;
                }
                check%=10;
                l3.next=new ListNode(check );
                plus=1;
            } else if (check < 9 && plus == 1) {


                check++;
                check%=10;
                l3.next=new ListNode(check );
                plus--;


            }
            else if (plus==0){


                l3.next=new ListNode(check);
            }
            else {
                check++;


                l3.next=new ListNode(0);

            }
            l3=l3.next;

        }
        if (plus==1){
            l3.next=new ListNode(1);
        }

        return head;
    }
}
