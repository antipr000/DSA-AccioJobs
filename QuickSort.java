public class QuickSort {
    public static void main(String[] args) {
        int []arr = {2, 1, 3, 4, 2, 5, 2, 3};
        QuickSortImpl qsl = new QuickSortImpl();

        qsl.quickSort(arr, 0, arr.length - 1);

        for(int el: arr) System.out.print(el + " ");
        System.out.println("");
    }
}

class QuickSortImpl{



    private int findInsertionPoint(int []arr, int beg, int end){
        /*
            Our aim is to place the pivot element in its actual place if the array was sorted.
            And in doing so ensure that all elements less than the pivot element goes to the left of the pivot
            and all greater goes to the right
        */
        int pivotElement = arr[end];
        int lastInsertionPoint = beg - 1;

        for(int i=beg;i<=end;i++){
            if(arr[i]<=pivotElement){
                lastInsertionPoint++;
                //swap(i, lastInsertionPoint)
                int temp = arr[lastInsertionPoint];
                arr[lastInsertionPoint] = arr[i];
                arr[i] = temp;
            }
        }
        /*
                pivotElement = 2
                lastInsertionPoint = 2

        */

        return lastInsertionPoint;
    }

    void quickSort(int []arr, int beg, int end){
        /*
            
        */
        if(beg >= end) return;

        int insertionPoint = findInsertionPoint(arr, beg, end);
        quickSort(arr, beg, insertionPoint - 1);
        quickSort(arr, insertionPoint + 1, end);
    }
}
