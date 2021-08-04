import java.util.*;

public class QueueCollection{
    public static void main() {
        Queue<Integer> q = new LinkedList<Integer>();
    }
}

class Node{
    int val;
    Node next;

    Node(int v, Node n){
        val = v;
        next = n;
    }
}

class QueueImpl{
    Node head, tail;

    QueueImpl(){
        head = tail = null;
    }

    boolean isEmpty(){
        if(head == null) return true;

        return false;
    }

    void push(int val){
        //Add an element at the back of the queue

        if(head == null){
            head = new Node(val, null);
            tail = head;
            return;
        }

        //1->2->3->4

        tail.next = new Node(val, null);
        tail = tail.next;
    }

    int poll(){
        //Remove the front element and return its value
        if(head == null) return -1;
        int val = head.val;
        head = head.next;
        if(head == null) tail = null;
        return val;
    }

    int peek(){
        //Get access to the front element
        if(head == null) return -1;
        return head.val;
    }
}