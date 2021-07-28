class PaintersProblem{

    private int getMax(int []C){
        int max_el = C[0];
        for(int i=1; i<C.length; i++){
            max_el = C[i] > max_el ? C[i] : max_el;
        }
        
        return max_el;
    }
    
    private int sum(int []C){
        int s = 0;
        for(int i=0;i<C.length;i++) s+=C[i];

        return s;
    }

    int minTime(int []C, int A, int B){
        for(int i=0; i<C.length; i++){
            C[i] *= B;
        }
        int lo = getMax(C);
        int hi = sum(C);

        while(lo<hi-1){
            int mid = (lo + hi)/2;
            if(P(mid, C, A) == true){
                hi = mid;
            } else lo = mid;
        }

        return hi;
    }

    private boolean P(int x, int []C, int A){
        return G(x, C) <= A;
    }

    private int G(int x, int []C) {
        /*
            [4, 5, 2, 3, 6]
            x = 9

            numWorkers = 3
            workload = 6

        */
        //Find min no of workers needed to complete the work within x minutes
        int numWorkers = 1;
        int workload = 0;
        for(int i=0;i<C.length;i++){
            if((workload + C[i]) <= x){
                workload += C[i];
            } else{
                numWorkers ++;
                workload = C[i];
            }
        }
        System.out.println("x is: " + x + " numWorkers is: " + numWorkers);
        return numWorkers;
    }


}