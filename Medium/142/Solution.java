
import java.util.ArrayList;
import java.util.List;

class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}

class Solution {

    public ListNode detectCycle(ListNode head) {
        List<ListNode> values = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            boolean contains = false;

            for (ListNode node : values) {
                if (node.equals(temp)) {
                    contains = true;
                    break;
                }
            }

            if (contains) {
                return temp;
            }

            values.add(temp);
            temp = temp.next;
        }

        return null;
    }
}
