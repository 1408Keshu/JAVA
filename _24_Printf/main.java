package _24_Printf;

public class main {
    public static void main(String[] args) {
        
        // printf()= an optional method to control, format, and display text to the console window
        // Two argument = format string + (object /variable/value);
        // % [flags] [precision] [ width] [conversion-charcter];

        
        // System.out.printf("%d This is Formate String \n",123);
        // System.out.printf("%f This is Formate String \n",12.3);
        // System.out.printf("%.2f This is Formate String \n",123.233);
        
        boolean myboolean= true;
        char mychar= '@';
        String myString = "Keshav";
        int myInt = 60;
        double myDouble = 1000;

        // System.out.printf("%b \n",myboolean);
        // System.out.printf("%c \n",mychar);
        // System.out.printf("%s \n",mySTring);
        // System.out.printf("%d \n",myInt);
        // System.out.printf("%f \n",myDouble);

        //[width]
        // minimum number of charcters to be written as output

        // System.out.printf("%10d",myInt);//"      60"
        // System.out.printf("%-10s",myString); //"keshav       "
        // System.out.printf("%10s",myString); // "      keshav"

        // [precision]
        // sets numbers of charcters to be written as output;
        // System.out.printf("%.3f",myDouble); // "1000.800"

        // [flags]
        // adds an effect to output based ont he flag added to format specifer
        // - : left-justify
        // + : out a plus (+) or minus (-) sign for added to format specifier
        // 0 : numeric  values are zero-padding 
        // , : comma grouping seperator if numbers > 1000 ;

        // System.out.printf("You have this much money %,f",myDouble);
        System.out.printf("You have this much money %020f",myDouble);
    }
}
