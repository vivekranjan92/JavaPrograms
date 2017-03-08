//Java program to delete alternate nodes of a linked list//

class AlternateLinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) 
        {
            data = d; 
            next = null; 
        }
    }

    void deleteAlt()
    {
        if (head == null) 
            return;

        Node prev = head;
        Node now = head.next;

        while (prev != null && now != null) 
        {
            prev.next = now.next;

            now = null;

            prev = prev.next;
            if (prev != null) 
                now = prev.next;
        }
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
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } 
            System.out.println();
    }

    public static void main(String args[])
    {
        AlternateLinkedList list = new AlternateLinkedList();
        
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.push(5);
        list.push(3);
        list.push(6);
        list.push(8);
        list.push(7);
        list.push(9);
        list.push(3);
        list.push(2);
        
        System.out.println("Linked List before calling delete ");
        list.printList();
        
        list.deleteAlt();
        
        System.out.println("Linked List after calling delete ");
        list.printList();
    }
}