package _12_whileLoop;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= "";
        // while(name.isBlank()){
        //     System.out.println("Enter your name: ");
        //     name = sc.nextLine();
        // }
        do{
            System.out.println("Enter your name: ");
            name = sc.nextLine();

        }while(name.isBlank());
        System.out.println("Hello " + name + " ji");

    }

}
