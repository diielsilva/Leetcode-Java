
class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

    public ListNode(int val) {
        this.val = val;
    }

}

public class Solution {

    public ListNode middleNode(ListNode head) {

        int size = 0;

        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int middle = Math.floorDiv(size, 2);

        temp = head;

        for(int i = 0; i < middle;i++) {
            temp = temp.next;
        }

        return temp;
    }
}
