package Queue;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node previous;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.previous=null;
    }
}
class QueueByLinkedList
{
    Node head=null;
    public Node insertionAtFront(int data,Node head)
    {
        Node newNode=new Node(data);
        if(head!=null)
        {
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }
    public Node deletionAtEnd(Node head)
    {
        if(head==null) return head;
        Node current=head;
        if(current.next==null)
        {
            current=null;
        }
        while(current.next.next!=null)
        {
            current=current.next;
        }
         current.next=null;
        return head;
    }
    public void peek(Node head)
    {
        if(head==null)
        {
            System.out.println("No data to peek");
        }
        System.out.println("peek is:"+head.data);
    }
    public void display(Node head)
    {
        if(head==null)
        {
            System.out.println("No data");
        }
        while(head!=null)
        {
            System.out.print(head.data+" >> ");
            head=head.next;
        }
    }
}
class QueueUsingLinkedList
{
    public static void main(String[]args)
    {
        QueueByLinkedList qll=new QueueByLinkedList();
        while(true)
        {
            System.out.println("Which Operation do you want to perform:");
            System.out.println("1.Insertion at Front  2.Deletion at End 3.what is peek? 4)Simply print the list");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            if(choice==0 || choice>4)
            System.out.print("INVALID OPTION:PLEASE CHOOSE FROM ABOVE OPTIONS");
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter data: ");
                    int data=sc.nextInt();
                    qll.head=qll.insertionAtFront(data,qll.head);
                }
                    break;
                case 2:
                    qll.head=qll.deletionAtEnd(qll.head);
                    break;
                case 3:
                    qll.peek(qll.head);
                     break;
                case 4:
                    qll.display(qll.head);
                    break;
                default:
                    System.out.print("Exiting...");
                    sc.close();
                    System.out.println("Invalid Options");
        }
    }
    }
}
