package _22_Methods;

public class main {
    public static void main(String[] args) {

        // String name="Keshu ji";
        // int age= 20;
        // hello(name,age);

        int a=6;
        int b=8;

        int result= sum(a,b);
        System.out.println(result);
    }
    //this is void function (without return statement);
    // static void hello(String name,int age){
    //     System.out.println("Hello "+ name);
    //     System.out.println("You are "+ age + " years Old");
    // }

    //This is return function
    static int sum(int a,int b){
        return a+b;
    }
}
