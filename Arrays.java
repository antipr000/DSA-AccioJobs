import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int []arr = {1, 2, 3, 4, 5};
        // System.out.println(arr.length);
        // int []arr2 = arr.clone();
        // arr2[0] = 10;
        // System.out.println(arr[0]);
        // System.out.println(arr2 + " " + arr);

        // int []arr = {10, 2, 13, 12, 32, 61, 17};

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println("");

        // for(int x: arr){
        //     System.out.println(x + " ");
        // }

        /*
            Write a program to find the min or max element
        */

        int []arr = {10, 32, 45, 5 , 67, 21, 2, 4};

        int maxElement = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxElement){
                maxElement = arr[i];
            }
        }

        /*
            maxElement = 67
            i = 5

        */

        // System.out.println("The maximum element is "+  maxElement);

        // Searching s = new Searching();

        // System.out.println("Does 6 exist in array? " + s.doesElementExist(arr, 6));


        int [][]matrix = new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                //00, 01, 02
                //10, 11, 12
            }
        }
        /*
            [
                [2, 3, 4],
                [1, 2, 3]
            ]
        */
        for(int[] rows :matrix){
            for(int x: rows){
                
            }
        }

    }
}

class Searching{
    /*
        Method to check if an element exists in a array
        [2, 3, 4, 1, 5] 
        el = 7

        */
    boolean doesElementExist(int []arr, int el){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == el){
                return true;
            }
        }

        return false;
    }
}