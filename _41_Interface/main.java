package _41_Interface;

public class main {
    public static void main(String[] args) {
        
        //Interface = a template that can be appleied to a class
                    // a similar inheritance ,but specifies what a class has/must do
                    // classes can apply more than one interface ,inheritance is limited to 1 super 

        // Rabbit rabbit= new Rabbit();
        // rabbit.flee();

        // Hawk hawk = new Hawk();
        // hawk.hunt();
         
        Fish fish= new Fish();
        fish.hunt();
        fish.flee();

    }
    
}
