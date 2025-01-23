package _35_MethodOverRiding;

public class main {
    public static void main(String[] args) {
         // Method OverRiding = Declaringa method in sub class
         //                     Which is already present in parent class
         //                     done so that a child class can give its implementation
        Animal animal= new Animal();
         Dog dog= new Dog();

         animal.speak();
         dog.speak();
    }
}
