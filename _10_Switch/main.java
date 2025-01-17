package _10_Switch;

public class main {
    public static void main(String[] args) {

        // switch = statement that allows a varible to be tested for equality against a list of value 

        String day = "Fri";
        switch (day) {
            case "Sunday":
                System.out.println("This is Sunday");
                break;
            case "Monday":
                System.out.println("This is Monday");
                break;
            case "Tuesday":
                System.out.println("This is Tuesday");
                break;
            case "wednesday":
                System.out.println("This is wednesday");
                break;
            case "Thursday":
                System.out.println("This is Thursday");
                break;
            case "Friday":
                System.out.println("This is Friday");
                break;
            case "Saturday":
                System.out.println("This is Saturday");
                break;
            default:
            System.out.println("it is not a day");
            
        }
        
    }

}
