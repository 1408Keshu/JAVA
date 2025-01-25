package _47_FileReader;

import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        
        // FileReader : read the content of the file as a stream of characters,one by one
        //              read() return an int value which contains the byte value;
        //               when read() return -1, there is no data to be read;
        
        try {
            FileReader reader= new FileReader("D:\\JAVA\\_47_FileReader\\art.txt");
            // int data = reader.read();
            // while(data!=-1){
            //     System.out.print((char)data);
            //     data = reader.read();
            // }
            // reader.close();
            FileReader reader2= new FileReader("D:\\JAVA\\_47_FileReader\\Story.txt");
            int data2= reader2.read();
            while(data2!= -1){
                System.out.print((char)data2);
                data2=  reader2.read();

            }
            reader2.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
