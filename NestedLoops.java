public class NestedLoops {
    public static void main(String[] args) {
        //Multiplication table
        // for(int i=1;i<=5;i++){
        //     System.out.println("Multiplication table for " + i);
        //     for(int j=1;j<=10;j++){
        //         System.out.println(i + " X " + j + " = " + i*j); 
        //     }
        // }
            
        /* 
            *
            **
            ***
            ****
            *****
            No of stars in ith row is i

            row = 3:
                coulumn = 1
        
            

            Output:
            *
            **
            ***

        */
        
        // for(int row=1;row<=5;row++){
        //     for(int column=1;column<=row;column++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        /*
            *****
             ****
              ***
               **
                *
            row = 1 : 0 space and 5 *
            row = 2 : 1 space and 4 *
            row = 3 : 2 spaces and 3*


            row = i : i-1 spaces and 5-i+1 *
        */

        for(int row=1;row<=5;row++){
            for(int spaces = 1; spaces<=row-1; spaces++){
                System.out.print(" ");
            }

            for(int stars=1; stars<=5-row+1; stars++){
                System.out.print("*");
            }

            System.out.println("");
        }

        /*
            *****
             ***
              *
            
              *      *
              **    **
              ***  ***
              ********
        */
    }
}
