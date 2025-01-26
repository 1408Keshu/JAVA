package _48_MusicPLayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class main {
 public static void main(String[] args) {


    String filePath="D:\\JAVA\\_48_MusicPLayer\\B Praak - Kya Loge Tum.wav";
    File file = new File(filePath);
    try( Scanner sc= new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
      
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        // System.out.println("no problem detected");

        String response= "";
        while(!response.equals("Q")){
            System.out.println("P = Play");
            System.out.println("S = Stop");
            System.out.println("R = Reset");
            System.out.println("Q = Quit");
            System.out.print("Enter your Choice: ");

            response = sc.next().toUpperCase();
            switch (response) {
                case "P" -> clip.start();
                case "S" -> clip.stop();
                case "R" -> clip.setMicrosecondPosition(0);
                case "Q" -> clip.close();
                default -> System.out.println("Invalid Choice");
                    
            }
        }

    } 
    catch(FileNotFoundException e){
        System.out.println("Could not locate file");
    }
    catch(UnsupportedAudioFileException e){
        System.out.println("Audio file is not Supported");
    }
    catch(LineUnavailableException e){
        System.out.println("UNable to access audio resource");
    }
    catch (IOException e) {
        // TODO: handle exception
        System.out.println("Something went Wrong");
    }
    finally{
        System.out.println("Bye");
    }
}   
}
