package _38_AccessModifier.Package1;
import  _38_AccessModifier.Package2.*;


public class A {
    //this mesg is only visible to its sub class(child);
    protected String ProtextedMessage="This message is protected";
    
    public static void main(String[] args) {
    
        // C c= new C();
        // System.out.println(c.PublicMsg);
        B b= new B();
        // System.out.println(b.PrivateMsg);
    }
}
