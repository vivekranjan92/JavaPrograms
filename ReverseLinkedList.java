class ReverseLinkedList
{
    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current!=null)
        {
            next= current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    void printList(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+ " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.head = new Node(25);
        rll.head.next = new Node(30);
        rll.head.next.next = new Node(35);
        rll.head.next.next.next = new Node(40);
        rll.head.next.next.next.next = new Node(45);

        System.out.println("Given LinkedList is :");
        rll.printList(head);
        head=rll.reverse(head);
        System.out.println();
        System.out.println("Reversed LinkedList is :");
        rll.printList(head);
        System.out.println();
    }
}