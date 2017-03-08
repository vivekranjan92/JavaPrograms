import java.util.*;

class Node
{
    int data;
    Node link;

    Node head;

    public Node()
    {
        link = null;
        data = 0;
    }   
    
    public Node(int d, Node n)
    {
        data = d;
        link = n;
    }
    public void setLink(Node n) 
    {
        link = n;
    }
    public void setData(int d)
    {
        data = d;
    }
    public Node getLink()
    {
        return link;
    }
    public int getData()
    {
        return data;
    }
}

class linkedList
{
    protected Node start;
    protected Node end ;
    public int size ;

    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }
    public int getSize()
    {
        return size;
    }   

    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            nptr.setLink(start);
            start = nptr;
        }
    }

    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(start == null) 
        {
            start = nptr;
            end = start;
        }
        else 
        {
            end.setLink(nptr);
            end = nptr;
        }
    }

    public void display()
    {
        System.out.print("\nSingly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ "-");
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
            System.out.print(ptr.getData()+ "-");
            ptr = ptr.getLink();
        }
        System.out.println(ptr.getData());
    }

    public void findSmallest()
    {
        
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }    
        if (start.getLink() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        int Smallest = start.getData();
        
        ptr = start.getLink();
        while (ptr.getLink() != null)
        {
           if(Smallest > ptr.getData())
           {
                Smallest = ptr.getData();
           }
            ptr = ptr.getLink();
        }
        System.out.println("Smallest Node is : " + Smallest);
    }

}
   
public class SmallInLinkedList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList(); 
        System.out.println("Enter number of Nodes to be inserted ");
        int number = scan.nextInt();
        
        for (int i=0;i<number;i++)
        {
            System.out.println("Enter Nodes to be inserted at positioin:"+i);
            list.insertAtEnd(scan.nextInt()); 
            
        }
        list.display();
        list.findSmallest();


    }
}


//public void deleteNode(ListNode node) {
//    node.val = node.next.val;
  //  node.next = node.next.next;
//}