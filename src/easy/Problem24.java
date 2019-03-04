package easy;

public class Problem24 {

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node = swapPairs(node);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }


    public static ListNode swapPairs(ListNode head) {
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode cur = dum;

        while(cur.next != null && cur.next.next != null){
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            second.next = first;
            cur.next = second;
            cur = cur.next.next;
        }
        return dum.next;
    }

     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
}
