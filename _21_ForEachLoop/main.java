package _21_ForEachLoop;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //for-each = traversing technique to iterate through the elements in an array/collection 
        //           less steps,more readable
        //           less flexible

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("TATA");
        
        cars.add("BMW");
        cars.add("Fortuner");
        cars.add("Lambo");

        for (String i : cars) {
            System.out.println(i);
        }

        // String[] animals = {"cat","dog","rat","bat"};
        // for (String i : animals) {
        //     System.out.println(i);
        // }
    }
}
