package _26_Objects;

public class main {
    public static void main(String[] args) {
        
        //object = instance of  a class may contain attribute and methods
        // example :(phone ,desk, computer, coffee cup);
        
        car mycar1= new car();
        car mycar2= new car();

        System.out.println(mycar1.color);
        System.out.println(mycar1.Model);
        System.out.println("-----------");
        System.out.println(mycar2.color);
        System.out.println(mycar2.Model);

        // mycar.brake();

        // mycar.drive();
    }
}
