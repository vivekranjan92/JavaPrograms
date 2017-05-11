class TwoListInOne
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
    void twoLinkedListInOne(Node a, Node b)
    {
        Node result = null;
        Node prev1= a, curr1= a, prev2=b, curr2=b;

        while(curr1!=null || curr2!=null)
        {
            int sum1 = 0, sum2 = 0;

            while(curr1!=null && curr2!=null && curr1.data!=curr2.data)
            {
                if (curr1.data<curr2.data)
                {
                    sum1 += curr1.data;
                    curr1=curr1.next;    
                }
                else
                {
                    sum2 +=curr2.data;
                    curr2=curr2.next;
                }
            }
            if (curr1==null)
            {
                while(curr2!=null)
                {
                    sum2+=curr2.data;
                    curr2=curr2.next;
                }
            }
            if (curr2==null)
            {
                while(curr1!=null)
                {
                    sum1+=curr1.data;
                    curr1=curr1.next;
                }
            }
            if (prev1==a && prev2==b)
            {
                result= sum1>sum2 ? prev1:prev2;    
            }
            else
            {
                if (sum1>sum2)
                {
                    prev2.next=prev1.next;
                }
                else
                {
                    prev1.next=prev2.next;
                }
            }
            prev1=curr1;
            prev2=curr2;

            if (curr1!=null)
            {
                curr1 =curr1.next;    
            }
            if (curr2!=null)
            {
                curr2=curr2.next;    
            }
        }
        while(result!=null)
        {
            //System.out.print("After merging the two linked list with some common value are:");
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args)
    {
        TwoListInOne ll1 = new TwoListInOne();
        TwoListInOne ll2 = new TwoListInOne();

        ll1.push(120);
        ll1.push(110);
        ll1.push(90);
        ll1.push(30);
        ll1.push(3);
        ll1.push(1);

        ll2.push(130);
        ll2.push(120);
        ll2.push(100);
        ll2.push(90);
        ll2.push(32);
        ll2.push(12);
        ll2.push(3);
        ll2.push(0);

        ll1.twoLinkedListInOne(ll1.head, ll2.head);
    }
}