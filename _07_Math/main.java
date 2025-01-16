package _07_Math;
import java.util.Scanner; 

public class main {
    public static void main(String[] args) {
        
        // double x= 3.14;
        // double y= 10;

        // double z= Math.max(x,y); //find maximum in x,y;
        // double z= Math.min(x,y); //find minimum in x,y;
        // double z= Math.abs(y); //find absolute value ;
        // double z= Math.sqrt(y); //find Square root value ;
        // double z= Math.round(x); //find round value ;
        // double z= Math.ceil(x); //find round up value ;
        // double z= Math.floor(x); //find round down value ;
        // System.out.println(z);

        //finding Hypotenuse

        double x;
        double y;
        double z;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of x:");
        x= sc.nextDouble();
        System.out.println("Enter value of y:");
        y= sc.nextDouble();
        // z= sc.nextDouble();
        z= (x*x) + (y*y);
        z = Math.sqrt(z);
        System.out.println("Hypotenuse: "+z);




    }
}
