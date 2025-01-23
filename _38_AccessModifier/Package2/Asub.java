package _38_AccessModifier.Package2;

import _38_AccessModifier.Package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        
        // C c= new C();
        // System.out.println(c.defaultMsg);

        Asub asub = new Asub();
        System.out.println(asub.ProtextedMessage);

    }
}
