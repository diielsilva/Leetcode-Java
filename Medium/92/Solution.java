
class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        int aux = 0;
        ListNode temp = head;
        ListNode init = null;
        ListNode end = null;

        while (temp != null) {
            aux++;

            if (aux == left) {
                init = temp;
            } else if (aux == right) {
                end = temp;
                break;
            }

            temp = temp.next;
        }

        while (left < right) {
            int a = end.val;
            end.val = init.val;
            init.val = a;

            init = init.next;

            temp = init;

            while (temp.next != null && !temp.next.equals(end)) {
                temp = temp.next;
            }

            end = temp;
            left++;
            right--;
        }

        return head;

    }

}
