package LinkedList.LinkedList_2D.Problems;
// Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data, Node next, Node prev)
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

class Delete_allOccurance {

    public static void main(String[] args) {

        int[] arr = {2,5,2,4,8,10,2,2};
        Node head = arrToLL(arr);
        Node temp = deleteAllOccurOfX(head,2);
        print(temp);
    }
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here

        Node temp = head;

        while(temp != null)
        {
            if(temp.data == x)
            {
                if(temp.prev == null)
                {
                    Node temp1 = temp.next;
                    temp1.prev = null;
                    temp.next = null;
                    temp = temp1;
                    head = temp1;
                }
                else if(temp.next == null)
                {
                    temp.prev.next = null;
                    temp.prev = null;
                    temp = null;
                }
                else
                {
                    Node front = temp.next;
                    Node back = temp.prev;
                    back.next = front;
                    front.prev = back;
                    temp = front;
                }
            }
            else
            {
                temp = temp.next;

            }

        }

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
}