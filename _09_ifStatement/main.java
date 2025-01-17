package _09_ifStatement;

public class main {
    public static void main(String[] args) {
        int age =75;
        if(age==75){
            System.out.println("ok boomer");
        }
        else if(age>18){
            System.out.println("Your are an adult ");

        }
        else if(age>=13){
            System.out.println("You are a teenager");;
        }
        else{
            System.out.println("you are not an adult");
        }
    }
}
