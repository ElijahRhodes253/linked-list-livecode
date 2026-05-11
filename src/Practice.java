public class Practice {
    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.data = 'x';

        ListNode node2 = new ListNode();
        node2.data = 't';

        ListNode node3 = new ListNode();
        node3.data = 'r';

        ListNode node4 = new ListNode();
        node4.data = 'w';

        node1.next = node2;
        node2.next = node3;
        node4.next = node1;

        ListNode extra = node4;
        node4.data = 'e';

        //System.out.println(extra.data);

        //System.out.println(node1.next.next.data);
        printList(node4);
        System.out.println(countX(node4));
    }

    public static void printList(ListNode head)
    {
        ListNode t2 = head;
        while(t2 != null)
        {
            System.out.println(t2.data);
            t2 = t2.next;
        }
    }

    public static int countX(ListNode head)
    {
        int count = 0;
        ListNode t2 = head;
        while(t2 != null)
        {
            if(t2.data == 'x'){count++;}
            t2 = t2.next;
        }
        return count;
    }
}
