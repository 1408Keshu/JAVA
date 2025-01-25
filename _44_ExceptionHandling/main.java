package _44_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        // exception = an event that occurs during the execution of a program that;
        //              disrupt the normal flow of instructions

        try{
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter value of x : ");
            int n= sc.nextInt();
            // System.out.println();
            System.out.print("Enter value of y : ");
            int m= sc.nextInt();
    
            int z= n/m;
            System.out.println("result :" + z);

        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("You can divided by Zero !!!!!!!!!");
        }
        catch(InputMismatchException e){
            System.out.println("PLease Enter a Number!!!!");
        }
        catch(Exception e){
            System.out.println("Something Went Wrong !!!!!");
        }
        finally{
            System.out.println("this will always print");
            // scanner.close();
        }
        


    }
}
