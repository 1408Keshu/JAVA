package _14_NestedLoop;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of row: ");
        int row=sc.nextInt();
        System.out.println("Enter value of column: ");
        int col=sc.nextInt();
        String symbol="$";
        for(int i=0 ;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(symbol+ " ");
            }
            System.out.println();
        }
        // for(int i=0 ;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
    }
}
