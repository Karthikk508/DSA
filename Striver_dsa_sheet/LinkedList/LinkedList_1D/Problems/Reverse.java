package LinkedList.LinkedList_1D.Problems;

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

public class Reverse {

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

    private static Node reverseList(Node head) {

        Node prev = null;

        while(head != null)
        {
            Node front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }
        return prev;
    }
    private static Node recRev(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node newHead = recRev(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        Node head = ArrToLL(arr);
        //print(head);

        Node temp = recRev(head);
        print(temp);



    }
}
