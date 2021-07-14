public class Recursion {
    public static void main(String[] args) {
        RecursionSolutions rs = new RecursionSolutions();
        System.out.println(rs.f(20));
    }
}
/*
    10 -> 5 -> 4 -> 2 -> 1 : 4
    10 -> 9 -> 3 -> 1 : 3
*/

class RecursionSolutions{

    public int f(int n){

        if(n == 1) return 0;

        if(n%6 == 0){
            return 1 + minThree(f(n-1), f(n/2), f(n/3));
        }
        if(n%3 == 0){
            return 1 + Math.min(f(n-1), f(n/3));
        }
        if(n%2 == 0){
            return 1 + Math.min(f(n-1), f(n/2));
        }
        return 1 + f(n-1);
    }

    private int minThree(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }
}