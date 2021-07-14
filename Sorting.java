import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int []A = {2, 5, 1, 2, 3, 4, 3};
        

        SortingAlgorithms sa = new SortingAlgorithms(A);

        sa.printArray();

        sa.bubbleSort();

        sa.printArray();
    }
}

class SortingAlgorithms{
    int []arr;
    SortingAlgorithms(int []newArr){
        arr = newArr.clone();
        // System.out.println("arr is " + arr + " newArr is " + newArr);
    }

    public void printArray(){
        System.out.println("Array elements are:");
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println("");
    }

    private void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selectionSort(){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            swap(i, minIndex);
        }
    }

    public void bubbleSort(){
        int n = arr.length;
        for(int i=1;i<n-1;i++){
            for(int j=0;j<(n-i);j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }
}
