import java.util.Scanner;

class Strings {
    public static void main(String[] args) {
        // String name = "Soham"; //String name = new String("Soham")
        // int age = 22;
        // System.out.println(name);
        // float marks = 81.22f;

        // System.out.printf("My name is %s and my age is %03d and my grade is %09.4f\n", name, age, marks);
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // System.out.println("You typed: " + s);
        // sc.close();

        String s = "Hello World";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        // System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));
        System.out.println(s.replace("l", "lll"));
        System.out.println(s);

        String p = "    Hello World    ";
        System.out.println(p.trim());
        String replaced = p.replace(" ", "#");
        replaced = replaced.replace("ello", "arry");

        System.out.println(replaced);
        
        Scanner sc = new Scanner(System.in);
        
        // double d = sc.nextDouble();
        // sc.nextLine();
        // s = sc.nextLine();
        
        // System.out.println(d + " " + s);

        System.out.println(s.indexOf("l"));

        // char c = 'A';
        // s = "" + c;
        // System.out.println(s);
        
        /*
            Hello World 
        */
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'l') System.out.println(i);
        }

        String s1="abhishek";
        String s2="abhishek";

        System.out.println(s1.equals(s2));
        sc.close();

        
    }
}