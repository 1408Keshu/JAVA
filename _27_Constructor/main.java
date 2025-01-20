package _27_Constructor;

public class main {
    public static void main(String[] args) {
        Human human1 = new Human("Keshav",20,55.7);
        Human human2 = new Human("badal",19,65.7);

        System.out.println(human1.name);
        // System.out.println(human1.age);
        // System.out.println(human1.weight);
        System.out.println();
        System.out.println(human2.name);
        // System.out.println(human2.age);
        // System.out.println(human2.weight);
        human1.eat();
        human2.walk();
        
    }
}
