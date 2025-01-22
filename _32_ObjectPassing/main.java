package _32_ObjectPassing;

public class main {
    public static void main(String[] args) {

        Garage garage= new Garage();

        Car car = new Car("Tata");
        Car car2 = new Car("Tesla");
        Bike bike = new Bike("bullet");
        Bike bike2 = new Bike("Fz-5");

        // garage.park(car );//to call the park mehtod we need to send object 
        // garage.park(car2 );//to call the park mehtod we need to send object 

        garage.repair(bike);
        garage.repair(bike2);
    }
}
