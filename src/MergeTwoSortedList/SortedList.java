package MergeTwoSortedList;

public class SortedList {
    int val;
    SortedList next;

    SortedList() {
    }

    SortedList(int val) {
        this.val = val;
    }

    public int sortedListShow(int val){
        System.out.println(val);
        val=next.val;
        return val;

    }
    SortedList(int val, SortedList next) {
        this.val = val;
        this.next = next;
    }
}
