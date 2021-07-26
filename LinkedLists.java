import java.util.Scanner;

class Node{
    int val;
    Node next;

    Node(){
        val = 0;
        next = null;
    }

    Node(int v, Node next){
        val = v;
        this.next = next;
    }
}

class LinkedListsMethods{
    /*
        1. Add element to end
        2. Delete element from end
        3. Add element to front
        4. Delete element from front
        5. Traverse a linked list
    */

    private Node head;

    LinkedListsMethods(){
        head = null;
    }

    Node getHead(){
        return head;
    }

    void addAtEnd(int val){
        if(head == null){
            head = new Node(val, null);
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = new Node(val, null);
        
    }


    void traverse(){
        System.out.println("Elements in the linkedlist:");
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val);
            if(curr.next != null)
                System.out.print("--->");
            curr = curr.next;
        }
        System.out.println("");
    }

    void addAtFront(int val){
        if(head == null){
            head = new Node(val, null);
            return;
        }
        /*
           head ->50 -> 10  -> 20 -> 30

            head = 2000
            addAtFront(50);
            [50, 1000] -> 2000

            temp = 2000
         */
        Node temp = new Node(val, head);
        head = temp;
    }

    void deleteAtIndex(int i){
        Node curr = head.next;
        Node prev = head;

        if(i == 0){
            head = head.next;
            return;
        }

        while(curr != null && (i-- > 0)){
            prev = curr;
            curr = curr.next;
        }

        if(curr == null){
            return;
        }

        prev.next = curr.next;

    }

    void reverseLinkedList(){
        //Homework
        /*
         null<-1<-2<-3<-4<-head
          curr = null
          prev = 4
          next = null
        */
        Node curr, prev;
        curr = head.next;
        if(curr == null) return;
        prev = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;
        
    }

}

public class LinkedLists {

    public static void main(String[] args) {
        LinkedListsMethods lmethods = new LinkedListsMethods();

        lmethods.addAtEnd(10);
        lmethods.addAtEnd(20);
        lmethods.addAtEnd(30);
        lmethods.addAtFront(50);

        lmethods.deleteAtIndex(1);

        lmethods.traverse();

    }
    
}

/* 
    [200, 300, 100, 20, 10]
    1000 1004 1008 1012 1016

    arr[i] = base_loc + i*4

    [200, 300, 100, 20, 10]
    [1000, 2000, 500, 10000, 20

*/