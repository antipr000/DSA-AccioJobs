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


}

public class LinkedLists {

    public static void main(String[] args) {
        LinkedListsMethods lmethods = new LinkedListsMethods();

        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        sc.nextLine();

        for(int i=0;i<n;i++){
            int el = sc.nextInt();
            lmethods.addAtEnd(el);
        }

        lmethods.traverse();

        sc.close();

    }
    
}

/* 
    [200, 300, 100, 20, 10]
    1000 1004 1008 1012 1016

    arr[i] = base_loc + i*4

    [200, 300, 100, 20, 10]
    [1000, 2000, 500, 10000, 20

*/