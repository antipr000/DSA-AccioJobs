import java.util.ArrayList;

public class Heaps {
}

class HeapImpl{
    int []heap;
    int n; //Size of heap
    HeapImpl(){
        heap = new int [100];
        n = 0;
    }

    int poll(){
        int val = heap[0];
        //n--
        n--;
        heap[0] = heap[n];
        heap[n] = 0;
        int pos = 0;
        while(pos<n){
            int lChild = 0, rChild = 0;
            if((2*pos+1) < n){
                lChild = heap[2*pos + 1];
            }
            if((2*pos+2) < n){
                rChild = heap[2*pos + 2];
            }

            if(lChild >= rChild && lChild > heap[pos]){
                heap[2*pos+1] = heap[pos];
                heap[pos] = lChild;
                pos = 2*pos + 1;
            } else if(rChild > lChild && rChild > heap[pos]){
                heap[2*pos+2] = heap[pos];
                heap[pos] = rChild;
                pos = 2*pos + 2;
            } else{
                break;
            }
        }

        return val;
    }

    void insert(int val){
        heap[n] = val;
        int pos = n;
        n++;
        while(pos > 0){
            int par = (pos - 1)/2;
            if(heap[par] < val){
                heap[pos] = heap[par];
                heap[par] = val;
                pos = par;
            } else{
                break;
            }
        }
    }
}
