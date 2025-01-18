package _19_ArrayList;
import java.util.ArrayList;
public class main {
 public static void main(String[] args) {
    // arrayList = a resizable array;
                    // Element can be added and removed after compilation phase
                    // / store reference data type 
    
    ArrayList<String> food = new ArrayList<String>();

    food.add("Pizza"); //add will will  take value in list 
    food.add("burger");
    food.add("doracake");

    food.set(0, "Dosa");
    food.remove(2);
    food.clear();

    for(int i=0;i<food.size();i++){
        System.out.println(food.get(i)); // give all items in food list of array
    }
 }   
}
