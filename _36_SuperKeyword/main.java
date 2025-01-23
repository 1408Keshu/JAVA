package _36_SuperKeyword;

public class main {
    public static void main(String[] args) {
       // super = keyword refers to the superclass(parent) of an object 
       //          very similar to the "this " keyword

       Hero h1= new Hero("Spiderman",23,"sling");
       Hero h2= new Hero("Ironman",45,"Money");
    //    System.out.println(h1.name);
    //    System.out.println(h1.age);
    //    System.out.println(h1.power);
    //    System.out.println(h2.name);
    //    System.out.println(h2.age);
    //    System.out.println(h2.power);

    System.out.println(h2.toString());

    }
}
