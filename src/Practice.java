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

        //ListNode extra = node4;
        node4.data = 'e';

        //System.out.println(extra.data);

        //System.out.println(node1.next.next.data);
        printList(node4);
        System.out.println(/*countX(node4) +*/ "\n");
        
        printList(removeAt(node4, 0));
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
    
    /**
     * Remove the node at remove index, and return the head of the list
     * Ex.
     * e -> t -> k -> y
     * 
     * removeIndex(node1, 2)
     * 
     * e -> t -> y
     */
    public static ListNode removeAt(ListNode head, int removeIndex)
    {
        ListNode current = head;
        
        if(removeIndex == 0)
        {
            return head.next;
        }
        else{
            for(int i = 0; i < removeIndex-1; i++)
            {
                current = current.next;
            }
            current.next = current.next.next;
        }
        return head;
    }
}
