import java.util.Scanner;

import java.util.ArrayList;


public class ArrayListImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        sc.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            arr.add(num);
        }

        arr.set(0, 200);
        
        System.out.println("The array elements are: ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }

    }
}
