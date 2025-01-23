package _37_Abstraction;

public class main {
    // Abstract = abstract classes cannot be instantiated ,but they can have a subclass
    //             abstract method are declared without an implementation

    // Vehicle vehicle = new Vehicle(); 
    //Now we made our vehicle class a abstract class so we no longer make instantiate vehicle class
    public static void main(String[] args) {
        Car car= new Car();
        car.go();
        
    }
    
}
