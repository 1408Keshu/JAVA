package _39_Encapsulation;

public class main {
    public static void main(String[] args) {
        
        //Encapsulation: sttributes of a class will be hidden or private;
        //               can be accessed only through methods (getters and setters)
        //               You should make attributes private if you dont't have reason to make them public;

        car c= new car("Mercedis","S-25",2023);
        // System.out.println(c.year);
        c.setyear(2025);
        c.setmodel("S-34");


        System.out.println(c.getmake());
        System.out.println(c.getmodel());
        System.out.println(c.getyear());

    }
}
