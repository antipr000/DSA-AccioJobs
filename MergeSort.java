
public class MergeSort {
    public static void main(String[] args) {
        MergeSortUtils msu = new MergeSortUtils();
        int []A = {2,3,1, 1, 2, 2, 4, 1, 2, 3, 5, 7, 9, 1};
        // msu.merge(A, 2, 6, 7, 11);
        // msu.printArray(A, 2, 11);
        msu.printArray(A, 0, A.length-1);
        msu.mergeSort(A, 0, A.length-1);

        msu.printArray(A, 0, A.length-1);

    
    }
}

class MergeSortUtils{

    public void printArray(int []arr, int l, int r){
        System.out.println("Array from " + l + " to " + r + " is:");
        for(int i=l;i<=r;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void merge(int []arr, int ls, int le, int rs, int re){
        int []temp = new int[re-ls+1];
        int pos = 0, st = ls;
        while(ls<=le && rs<=re){
            if(arr[ls] <= arr[rs]){
                temp[pos++] = arr[ls++];
            } else{
                temp[pos++] = arr[rs++];
            }
        }

        while(ls<=le){
            temp[pos++] = arr[ls++];
        }

        while(rs<=re){
            temp[pos++] = arr[rs++];
        }

        for(int i=0;i<pos;i++){
            arr[st+i] = temp[i];
        }
    }

    public void mergeSort(int []arr, int lo, int hi){
        //sort the array from [lo, hi]

        if(lo == hi){
            return;
        }

        int mid = (lo + hi)/2;
        mergeSort(arr, lo, mid); //[lo, mid]
        mergeSort(arr, mid+1, hi); //[mid+1, hi]
        merge(arr, lo, mid, mid+1, hi); //[lo, hi] is sorted
    }
}

/*
    
              [1, 2, 2, 2, 3, 3, 4]

    [1, 2, 3, 4]              [2, 2, 3]
           
*/