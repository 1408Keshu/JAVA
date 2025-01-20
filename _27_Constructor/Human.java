package _27_Constructor;

public class Human {
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight ){
        this.name= name;
        this.age=age;
        this.weight=weight;
    }

    void eat(){
        System.out.println(name+" is eating food");
    }
    void walk(){
        System.out.println(name+ " is Walking on footpath");
    }

}
