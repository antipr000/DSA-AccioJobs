import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) {
        int sum = 0;
        // for(int i=10;i>=0;--i){
        //     sum += i;
        //     System.out.printf("We are at %d th iteration. Sum is %d\n", i, sum);
        // }
        
        // for(char a = 'A'; a<='Z'; a++){
        //     if(a == 'C') continue;
        //     System.out.println("Character is: " + a);
        // }
        // //here
        // /*
        //     sum = 55 , i=11
        // */
       
        // 
        // while(i<=10){
        //     System.out.println("i is: " + i);
        //     i+=1;
        // }

        // while(true){
        //     if(i==10) break;
        //     System.out.println("i is: " + i);
        //     i++;
        // }
        // int i=11;
        // do{
        //     System.out.println("i is: " + i);
        //     i+=1;
        // }while(i<=10);

        // for(int i=1;i<=100;i++){
        //     if(i%2==0){
        //         sum += i;
        //     }
        // }
        // Sum of even numbers upto 100
        // for(int i=2;i<=100;i+=2){
        //     sum += i;
        // }
        
        //Sum of digits of a number

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to continue.");
        int n = sc.nextInt();
        
        /* 
            n = 512, n%10 gives the last digit of any number
                     n/10 gives you a number after last digit is removed
            
            n = 9212 = 921*10 + 2
            n%10  -> 2
            n/10 9212/10 -> 921

            n%10 -> 1
            n/10 -> 92
            
        */
        
        while(n>0){
           sum += n%10;
           n/=10; //n = n/10
        }

        sc.close();

        System.out.println(sum);
    }
}
