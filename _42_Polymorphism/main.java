package _42_Polymorphism;

public class main {
 //Polymorphism = greek word for poly -"many",morph-"form";
    //               the ability of an object ro identify as more than one type;
public static void main(String[] args) {
    
    Car car = new Car();
    Bicycle bicycle= new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racers= {car,bicycle,boat};

    for(Vehicle x:racers){
        x.go();
    }   
}
}
