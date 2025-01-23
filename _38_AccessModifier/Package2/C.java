package _38_AccessModifier.Package2;
import  _38_AccessModifier.Package1.*;
public class C {        
        String defaultMsg= "This is default Messsage"; 
        //this msg is only visible to this package files
        //but
        public String PublicMsg = "This is a public message";
        // public vible all package
        protected String protectedMsg = "This is a protected message";
        //protected msg visible to it class and its sub classes(child)
        private String privateMsg = "This is a private message";
        //private only visible to it class
        
        
}

