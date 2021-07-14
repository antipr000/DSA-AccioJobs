import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int [][]mat = new int[2][3];

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                mat[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum += mat[i][j];
            }
        }
        System.out.println(mat[0][2]);
        System.out.println(sum);
        sc.close();
    }
}
