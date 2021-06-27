import java.util.Scanner;


class Variables{
    public static void main(String []args) {
        int number;
        number = 10;

        System.out.println(number);

        double floatingPointNum = 4.33321;
        System.out.println(floatingPointNum);
        
        int $second_number2 = 10;
        System.out.println($second_number2);

        boolean isAvailable = false;
        
        isAvailable = true;

        System.out.println(isAvailable);

        char x = '*';
        
        int asciiOfX = x;

        System.out.println("The ascii value of " + x + " is: " + asciiOfX);

        //Char to float
        float aRandomValue = x;
        System.out.println(aRandomValue);
        //Taking inputs

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the first number");
        // int number1 = sc.nextInt();

        // System.out.println("Please enter the second number");
        // int number2 = sc.nextInt();

        // System.out.println("The sum of " + number1 + " and " + number2 + " is: " + 
        // (number1 + number2));


        // String s = sc.nextLine();

        // System.out.println("Hi you have entered: " + s);

        // String s = sc.next();
        // String secondWord = sc.next();
        // System.out.println("Hi you have entered: " + s + " " + secondWord);


        // double inputDouble = sc.nextDouble();
        // System.out.println("You have entered: " + inputDouble);
        sc.close();

    }
}