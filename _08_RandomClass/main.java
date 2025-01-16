package _08_RandomClass;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        
        Random random=new Random();

        // int z= random.nextInt(9)+1; // give random val , bound help to give a range for random val btw 0 to that bound
        // double d= random.nextDouble();  // default give random double val btw 0-1
        boolean b= random.nextBoolean();
        
        System.out.println(b);
    }
}
