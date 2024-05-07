
import java.math.BigInteger;

class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

}

class Solution {

    public ListNode doubleIt(ListNode head) {
        StringBuilder builder = new StringBuilder();
        ListNode previous = null;
        ListNode temp = head;

        while (temp != null) {
            builder.append(temp.val);
            temp = temp.next;
        }

        BigInteger doubledValue = new BigInteger(builder.toString());
        BigInteger value = new BigInteger("2");
        doubledValue = doubledValue.multiply(value);
        String finalResult = String.valueOf(doubledValue);

        for (int i = 0; i < finalResult.length(); i++) {
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(finalResult.charAt(i))));

            if (previous == null) {
                previous = node;
                head = previous;
            } else {
                previous.next = node;
                previous = node;
            }
        }

        return head;
    }

}
