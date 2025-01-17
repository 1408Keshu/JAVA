package _16_2DArray;

public class main {
    public static void main(String[] args) {
        
        String[][] cars= {
            {"Tata","Mahindra","Fortuner"},
            {"Tata","Mahindra","Fortuner"},
            {"Tata","Mahindra","Fortuner"}
        };

        // String[][] cars= new String[3][3];

        // cars[0][0] = "Tata";
        // cars[0][1] = "Mahindra";
        // cars[0][2] = "Fortuner";
        // cars[1][0] = "Scorpio";
        // cars[1][1] = "Tesla";
        // cars[1][2] = "BMW";
        // cars[2][0] = "Rolls-Royale";
        // cars[2][1] = "lambergini";
        // cars[2][2] = "ferari";

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println( cars[i][j]);
            }
        }
    }
}
