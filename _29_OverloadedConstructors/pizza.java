package _29_OverloadedConstructors;


public class pizza {
    String bread;
    String sauce;
    String Topping;
    String cheese;

    pizza(String bread,String sauce,String Topping){
        this.bread= bread;
        this.sauce = sauce ;
        this.Topping = Topping ;
        // this.cheese=cheese ;
    }
    pizza(String bread,String sauce){
        this.bread= bread;
        this.sauce = sauce ;
        // this.Topping = Topping ;
        // this.cheese=cheese ;
    }
    pizza(String bread){
        this.bread= bread;
      
    }
    pizza(String bread,String sauce,String Topping,String cheese){
        this.bread= bread;
        this.sauce = sauce ;
        this.Topping = Topping ;
        this.cheese=cheese ;
    }
}
