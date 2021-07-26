public class BinarySearch{
    public static void main(){
        int []arr = {1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 9 , 10};
        BinarySearchImpl bs = new BinarySearchImpl();
        System.out.println("Finding 2: " + bs.isPresent(arr, arr.length, 2));
        System.out.println("Finding 10: " + bs.isPresent(arr, arr.length, 10));
        System.out.println("Finding 8: " + bs.isPresent(arr, arr.length, 8));
    }

}

class BinarySearchImpl{
    boolean isPresent(int []arr, int n, int target){
        int lo = 0 , hi = n-1;
        while(lo<=hi){
           int mid = (lo+hi)/2;
           System.out.println("Current range we are considering: " + lo + " - " + hi);
           if(arr[mid] == target) return true;
           else if(arr[mid]<target){
               lo = mid+1;
           } else{
               hi = mid-1;
           } 
        }

        return false;
    }
}

