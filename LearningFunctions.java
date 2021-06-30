import java.util.Scanner;

class Functions {
   public static void main(String[] args) {
      // Addition obj = new Addition();
      //  System.out.println(obj.add(2, 3));
      //  System.out.println(obj.add(5, 6));

      Scanner sc = new Scanner(System.in);

      // System.out.println("Hi. Please enter your name to continue!");

      // String name = sc.nextLine();

      // FirstProgram fp = new FirstProgram();

      // FirstProgram.greetings(name);
      // FirstProgram.greetings("Priyanshu");
      // FirstProgram.greetings("Aadhitya");

      System.out.println("Enter 2 numbers to compare");

      int a = sc.nextInt();
      int b = sc.nextInt();

      MathematicalFunctions mf = new MathematicalFunctions();

      System.out.println(mf.max(a, b));


      System.out.println(mf.sumOfSquares(2, 3));

      System.out.println(mf.greaterLengthString("Soham", "ABCD"));

      sc.close();
   }  
}

class MathematicalFunctions{
   int add(int a, int b){
      return a+b;
   }
   
   int max(int a, int b){
      if(a>=b) return a;
      else return b;
   }

   int sumOfSquares(int a, int b){
      return add(a*a, b*b);
   }

   String greaterLengthString(String a, String b){
      if(a.length() >= b.length()) return a;
      return b;
   }
}

class FirstProgram{
   static void greetings(String name){
      System.out.printf("Hi %s! Welcome to Pre Course Batch.%n", name);
   }
}