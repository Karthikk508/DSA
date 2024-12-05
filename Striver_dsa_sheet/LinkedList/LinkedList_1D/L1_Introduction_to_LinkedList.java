package LinkedList.LinkedList_1D;


class Node {
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }

    Node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}

public class L1_Introduction_to_LinkedList {

    private static void print(Node head)
    {
        ///Traverse
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private static void deleteHead(Node head)
    {
        //Deletion //head
        head = head.next;
        System.out.println("After deletion of head");
        print(head);
    }

    private static void deleteTail(Node head)
    {
        //tail
        Node temp3 = head;
        System.out.println("After deletion of tail");
        while(temp3.next.next != null)
        {
            temp3 = temp3.next;
        }
        temp3.next = null;
        print(head);

    }

    private static Node deleteKthnode(int k,int size,Node head)
    {
        if(head == null) return head;

        if(k == 1)
        {
            deleteHead(head);
            return head;
        }
        if(k == size)
        {
            deleteTail(head);
            return head;
        }

        System.out.println("After deleting kth node");

        int count = 1;

        Node temp = head;

        while(count < k-1)
        {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;

        return head;
    }

    //Insert at start
    private static Node insertAtHead(Node head,int data)
    {
        return new Node(data,head);
    }

    //insert at end
    private static Node insertAtEnd(int data,Node head)
    {
        if(head == null)
        {
            return new Node(data);
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;

        return head;
    }
    //Insert at specific

    private static Node InsertAtSpecific(int data,int k ,Node head)
    {

        int count = 1;
        Node temp = head;

        if(k == 1)
        {
            head = insertAtHead(head,data);
            return head;
        }

        while (count<k-1)
        {
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static Node InsertBeforeValue(int val,int data,int k ,Node head)
    {

        Node temp = head;

        if(val == 1)
        {
            head = insertAtHead(head,data);
            return head;
        }
        if(val == k)
        {
            head = insertAtEnd(data,head);
            return head;
        }

        while (temp.next.data != val)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    private static Node ArrToLL(int[] arr)
    {

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        //System.out.println(head.next);
        return head;

    }
    public static void main(String[] args) {

        int[]  arr = {1,2,3,4,5};
        //Node node = new Node(arr[3]);
        //System.out.println(node.data);

        Node head =  ArrToLL(arr);
        // print(head);

        //Deletion

        // deleteHead(head);
        // deleteTail(head);
        //deleteKthnode(5,5,head);
        //print(head);

        //Insertion
        //head = insertAtHead(head);
        //System.out.println("After insertion");
        //print(head);

//        head = insertAtEnd(1200,head);
//        System.out.println("After insert at end");
//        print(head);
//
//        head = InsertAtSpecific(1200,5,head);
//        System.out.println("After insert at specific-pos");
//        print(head);\

        head = InsertBeforeValue(5,1200,6,head);
        System.out.println("After insert at specific-pos");
        print(head);


    }
}
