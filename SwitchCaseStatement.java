public class SwitchCaseStatement {
    public static void main(String[] args) {
        char grade = 'C'; //A B C D E F
        
        switch(grade){
            case 'A':
                System.out.println("You have a got grade A. Congrats!");
                break;
            case 'B':
                System.out.println("You have a got grade B. Congrats!");
                break;
            case 'C':
                System.out.println("You got a C grade. Work harder!");
                break;
            case 'D':
                System.out.println("You got a D grade. Work harder!");
                break;
            case 'E':
                System.out.println("Sorry you have failed!");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }
}
