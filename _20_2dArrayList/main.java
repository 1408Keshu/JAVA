package _20_2dArrayList;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> Grosery = new ArrayList();

        ArrayList<String> veg = new ArrayList<String>();
        veg.add("tomatoes");
        veg.add("carrot");
        veg.add("potatoes");

        ArrayList<String> dairy = new ArrayList<String>();
        dairy.add("milk");
        dairy.add("cheese");
        dairy.add("curd");

        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("bread");
        bakery.add("cake");
        bakery.add("biscuit");

        Grosery.add(veg);
        Grosery.add(dairy);
        Grosery.add(bakery);
        System.out.println(Grosery);

        
    }
}
