package LinkedList.LinkedList_2D;


class Node {
    int data;
    Node next;
    Node prev;
    Node(int data, Node next,Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data1)
    {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}


public class DDL {

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
    private static Node deleteHead(Node head)
    {
        if(head == null)
        {
            return head;
        }
        Node temp = head;
        head = temp.next;

        temp.next = null;
        temp.prev = null;

        return head;
    }
    private static Node deleteEnd(Node head)
    {
        if(head == null)
        {
            return head;
        }
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        Node tail = temp.prev;
        tail.next = null;
        tail.prev = null;

        return head;
    }


    private static Node deleteKthNode(int k,Node head)
    {
        int count = 1;
        Node temp = head;

        while (count < k) {
            temp = temp.next;
            count++;
        }

        Node back = temp.prev;
        Node front = temp.next;


        if(head == null)
        {
            return head;
        } else if (back == null) {
            return  deleteHead(head);
        } else if (front == null) {
            return deleteEnd(head);
        }
        else {
            back.next = front;
            front.prev = back;
        }
        return head;
    }

    private static void deleteNode(Node temp)
    {
        Node front = temp.next;
        Node prev = temp.prev;

        if(front == null)
        {
            temp.prev = null;
            prev.next = null;
            return;
        }
        if(prev == null)
        {
            deleteHead(temp);
            return;
        }
        front.prev = prev;
        prev.next = front;

        temp.prev = temp.next = null;
    }

    // Insert at head

    private static Node InsertAtHead(int data,Node head)
    {
        Node newNode = new Node(data,head,null);
        head.prev = newNode;
        return newNode;
    }

    private static Node InsertAtTail(int data, Node head) {

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data,null,temp);
        temp.next = newNode;

        return head;

    }
    private static Node InsertBeforeKthElement(int k,int data,Node head)
    {
        if(k == 1)
        {
            return InsertAtHead(data,head);
        }

        Node temp = head;
        int count = 1;

        while(count < k-1) {
            temp = temp.next;
            count++;
        }

        Node front = temp.next;

        if(front == null)
        {
            return InsertAtTail(data,head);
        }
        Node newNode = new Node(data,front,null);
        front.prev = newNode;
        newNode.prev = front;
        temp.next = newNode;

        return head;

    }



    private static Node arrToLL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        Node head = arrToLL(arr);
        //print(head);

        //Delete head               ////////////////////////////////////////////
//      Node temp = deleteHead(head);
//      print(temp);

        //Delete end
//        Node temp = deleteEnd(head);
//        print(temp);

        //Delete kth node
//        Node temp = deleteKthNode(3,head);
//        print(temp);

        //Delete node
//
//        int target = 1;
//        Node temp = head;
//
//        while(temp.next != null)
//        {
//            if(temp.data == target)
//            {
//                break;
//            }
//            temp = temp.next;
//        }
//
//        deleteNode(temp);
//        print(head);

        //Insert node             //////////////////////////////////////////////

        // At head
        //Node temp = InsertAtHead(10,head);
        //print(temp);

        // At tail
//        InsertAtTail(20,head);
//        print(head);

        // Insert before kth element
        int k = 3;
        Node temp = InsertBeforeKthElement(5,200,head);
        print(temp);






    }


}
