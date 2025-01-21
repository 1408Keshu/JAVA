package _30_ToString;

public class main {
    public static void main(String[] args) {

        //toString() = special method that alll objects inherit;
                    //that return a string that ""textually represents" an object;
                    //can be used both implicitly and explicitly;

        Car car= new Car();
        // System.out.println(car.Model);
        // System.out.println(car.color);
        // System.out.println(car.year);
        // System.out.println(car.brand);

        // System.out.println(car.toString()); //explicitly
        System.out.println(car);//implicitly
    }
}
