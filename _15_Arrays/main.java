package _15_Arrays;

public class main {
    public static void main(String[] args) {
         // array = used to multiple values in single variable
        //  String[] cars = {"Tata","lamborgini","BMW","Maruti-suzyki"};
        //  cars[0]= "mustang";
        
        String[] cars= new String[3];
        cars[0]= "tata";
        cars[1]= "toyota";
        cars[2]= "tesla";
        
        System.out.println(cars[1]);
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }

    }
}
