package _34_Inheritance;

public class main {
    public static void main(String[] args) {
        
        //inheritance = the process where one class acquire,
                   //     the attribute and method of another;

        Car car = new Car();
        Bicycle bike= new Bicycle();

        // bike.stop();

        // car.go();

        System.out.println(bike.speed);
        System.out.println(car.speed);

        System.out.println(car.door);
        System.out.println(bike.wheels);
    }
}
