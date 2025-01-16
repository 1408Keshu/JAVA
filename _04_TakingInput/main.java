package _04_TakingInput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//         System.out.println("Taking input from User:");
        Scanner sc =new Scanner(System.in);
//         System.out.println("Enter numer 1");
//         // int a= sc.nextInt();
//         float a= sc.nextFloat();
//         System.out.println("enter number 2");
//         // int 4b=sc.nextInt();
//         float b =sc.nextFloat();
//         float sum=a+b;
//         System.out.println("The sum of the these number is :");
        // System.out.println(sum);
        // boolean b1= sc.hasNextInt();
        // System.out.println(b1);
            System.out.println("Enter your Name: ");
            String name= sc.nextLine();
            System.out.println("Enter your age");
            int age = sc.nextInt();
            System.out.println("Give us Rating out of 1-10");
            int score=sc.nextInt();
            // System.out.println("What do like to eat");
            // String food=sc.nextLine();
            
            System.out.println("Helloo " + name);
            System.out.println("Your age is " + age);
            // System.out.println("you like "+ food);
            System.out.println("Thanks for giving us " + score);



            
}
}  
