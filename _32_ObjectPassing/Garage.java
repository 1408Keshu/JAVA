package _32_ObjectPassing;

public class Garage {
 
    void park(Car car){
        System.out.println("The "+ car.name+" is Parked in Garden");
    }
    void repair(Bike bike){
        System.out.println(bike.name+" is repaired ");
    }
}
