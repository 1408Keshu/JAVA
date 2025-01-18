package _18_WrapperClass;

public class main {
    public static void main(String[] args) {
         // wrapper class= provide a way to use primitive data types a s reference data types
         //                 reference data types contain useful methods
        //                  can be used with collection (ex. Array List)

        // primitive    wrapper
        // boolean      Boolean
        // char         Character
        // inr          Integer
        // double       Double

        //autoboxing = the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
        // unboxing the reverse of autoboxing. automatic conversion of wrapper class to primitive 

        Boolean a= true;
        Character b= '@';
        Integer c =123;
        Double d= 31.1323;
        String e = "Kalu ji" ;
        if(b=='@'){
            System.out.println("This is true");

        }


    }
}
