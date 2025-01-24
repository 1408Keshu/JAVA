package _40_CopyObjects;

public class main {
    public static void main(String[] args) {
        
        car c1= new car("Tata","T-39",2022);
        // car c2= new car("BMW","B-23",2018);

        // c1=c2;
        // c1.Copy(c2);
        car c2= new car(c1);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
        System.out.println(c1.getmake());
        System.out.println(c1.getmodel());
        System.out.println(c1.getyear());
        System.out.println();
        System.out.println(c2.getmake());
        System.out.println(c2.getyear());
        System.out.println(c2.getmodel());

    }
}
