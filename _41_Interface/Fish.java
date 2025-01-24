package _41_Interface;

public class Fish implements Predator,Prey {

    @Override
    public void hunt(){
        System.out.println("Fish is Hunting");
    }

    @Override
    public void  flee(){
        System.out.println("Fish is Fleeing");
    }

}
