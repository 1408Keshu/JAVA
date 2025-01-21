package _29_OverloadedConstructors;

public class main {
    //overloaded Constructors = multiple constructors within a class with th same name;
                            // but have different parameters
                            // name+ parameters = signature;
public static void main(String[] args) {

    pizza p= new pizza("thicc Crust","Hoot red Sause","Corn & onion");

    System.out.println("here are  the ingredients");
    System.out.println(p.bread);
    System.out.println(p.sauce);
    System.out.println(p.cheese);
    System.out.println(p.Topping);
    
}

}
