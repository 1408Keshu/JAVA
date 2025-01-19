package _23_OverLoading;

public class main {
    public static void main(String[] args) {
        
        // Overloading method : methods that share the same name but have different parameters 
        //                      method name + parameters = method signature;

        double sum= add(1.4,4.7,4.9);
        System.out.println(sum);


    }
    static int add(int a,int b){
        System.out.println("This is overloading #1");
        return a+b;
    }
    static int add(int a,int b,int c){
        System.out.println("This is overloading #2");
        return a+b;
    }
    static int add(int a,int b,int c,int d){
        System.out.println("This is overloading #3");
        return a+b;
    }
    static double add(double a,double b){
        System.out.println("This is overloading #4");
        return a+b;
    }
    static double add(double a,double b,double c){
        System.out.println("This is overloading #5");
        return a+b;
    }
    static double add(double a,double b,double c,double d){
        System.out.println("This is overloading #6");
        return a+b;
    }
}
