import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        int x = 13;
        int y = 10;

        // System.out.println(x+y);
        // System.out.println(x-y);
        // System.out.println(x*y);
        // System.out.println(((x * 1.0)/ (1.0 * y)));
        // System.out.println(x%y);
        //x=13
        // System.out.println(++x);
        // System.out.println(--x);
        // System.out.println(x);
    
        // System.out.println(x++);
        // System.out.println(x--);
        // System.out.println(x);

        //x=16
        // System.out.println(x++ + " " + ++x + " " + x++);

        int a = 10;
        int b = 9;
        b = a + 20;
        System.out.println(b);

        b += a; //b = b + a
        System.out.println(b);

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<10*b);
        System.out.println(a!=b);

        /*
            1 & 0 = 0
            1 | 0 = 1
            a & b = 1000100101 & 1011110110
            >>, <<
                a = 01000011 -> a<<1 -> 10000110
                a<<1 = 2*a
                a>>1 = a/2

                a<<x a = 2^x*a
                a>>x a = a/2^x
        */

        System.out.println(2*3+4/5*6); //6  
        System.out.println(2*3+4*5/6);  //9   
        a = b = 10;
        System.out.println("a is: " + a + " b is: " + b);
        /*
            a = 12 
        */
        a = a++ - ++a;

        System.out.println("a is: " + a + " b is: " + b);

        /* 
            C/5 = (F-32)/9
            C = 5*(F-32)/9
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter current temperature in farenheit");
        
        double farenheit = sc.nextDouble();

        double celsius = 5*(farenheit - 32)/9;

        System.out.println("Current temperature in celsius is: " + celsius);

        /*
            (b^2-4*a*c)/2a
            Given a, b, c calculate the value of the above expression
        */

        System.out.println("Enter values a b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("a=" + a + " b=" + b + " c=" + c);

        // int expression = (b*b - 4*a*c)/(2*a);
        double expression = (1.0 * (b*b - 4*a*c)) / (2.0 * a);
        System.out.println("value of expression is: " + expression);
        sc.close();

    }
}