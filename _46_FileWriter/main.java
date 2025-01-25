package _46_FileWriter;

import java.io.FileWriter;

public class main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("Story.txt");
            writer.write("Once upon a Time \n There was a king \n");
            writer.append("A Story from real incident");
            writer.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }   
}
