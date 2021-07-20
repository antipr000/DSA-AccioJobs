public class Polymorphism {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(2, 3));
        System.out.println(addition.add(2.3, 3));
        System.out.println(addition.add(2, 3, 4));
    }
}


class Addition{
    int add(int a, int b){
        System.out.println("Called integer addition");
        return a+b;
    }

    long add(long a, long b){
        System.out.println("Called long addition");
        return a+b;
    }

    double add(double a, double b){
        System.out.println("Called double addition");
        return a+b;
    }

    int add(int a, int b, int c){
        System.out.println("Called 3 integer addition");
        return a+b+c;
    }
}