package _45_FileClass;

import java.io.File;

public class main {
    public static void main(String[] args) {
        
        //file = abstract representation od file and directory pathnames

        File file = new File("D:\\JAVA\\_45_FileClass\\SecretMsg.txt");

        if(file.exists()){
            System.out.println("That file exists! :true ");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();

        }
        else{
            System.out.println("That file Doesn't exists! :true ");
        }
    }
}
