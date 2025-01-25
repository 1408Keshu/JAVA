package _43_DynamicPolymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.print("2 for Dog / 1 for Cat :");
        int choice= sc.nextInt();

        if(choice==1){
            Animal animal= new Cat();
            animal.speak();
        }
        else if(choice==2){
            Animal animal= new Dog();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice");
            Animal animal = new Animal();
            animal.speak();
        }

    }
}
