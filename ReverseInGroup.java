/*
* program to reverse the LinkedList in group of given size
* 1 2 3 4 5 6 7 8 9 will become 3 2 1 6 5 4 9 8 7 as the group size is 3
*/
class ReverseInGroup
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    Node reverse(Node head, int k)
    {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        while(count<k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next!=null)
        {
            head.next = reverse(next, k);    
        }
        return prev;
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList()
    {
        Node temp = head;

        while(temp!=null)
        {
            System.out.print(temp.data+ " " );
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ReverseInGroup rig = new ReverseInGroup();
        rig.push(9);
        rig.push(8);
        rig.push(7);
        rig.push(6);
        rig.push(5);
        rig.push(4);
        rig.push(3);
        rig.push(2);
        rig.push(1);
        rig.push(15);
        rig.push(16);
        rig.push(17);

        System.out.print("Original Linked List : ");
        rig.printList();
        rig.head = rig.reverse(rig.head, 3);
        System.out.print("Linked List after reversing : ");
        rig.printList();

        System.out.println();
    }
}