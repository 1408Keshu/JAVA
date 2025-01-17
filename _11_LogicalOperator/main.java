package _11_LogicalOperator;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        
        // logical operators = user to connect two or more expressions
        //  && = (AND) if both are true
        //  || = (OR)  if any of them is true
        //  !  = (NOT) reverse boolean value of condition

        // && operator

        // int temp=27;
        // if(temp>30){
        //     System.out.println("Its hot outside");
        // }
        // else if(temp>=20 && temp<=30){
        //     System.out.println("Its warm outside");
        // }
        // else{
        //     System.out.println("Its cold outside");
        // }


        // || operator
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Do you want to quit the game? Press q or Q to quit");
        // String response= sc.next();
        // if(response.equals("q") || response.equals("Q")){
        //     System.out.println("You Quit the Game !!");

        // }else{
        //     System.out.println("You are Still playing the game ** pew pew ** ");
        // }


        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to quit the game? Press q or Q to quit");
        String response= sc.next();
        if(!response.equals("q") &&
         !response.equals("Q")){
            System.out.println("You are Still playing the game ** pew pew ** ");
            
        }else{
            System.out.println("You Quit the Game !!");
        }



    }
}
