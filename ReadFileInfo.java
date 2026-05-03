package File;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args){
        File myFile = new File("test.txt");
        if(myFile.exists()) {
            System.out.println("File name:" + myFile.getName());
            System.out.println("Absolute path:" + myFile.getAbsolutePath());
            System.out.println("Writeable:" + myFile.canWrite());
            System.out.println("Readable:" + myFile.canRead());
            System.out.println("File size in bite:" + myFile.length());
        } else {
            System.out.println("The fie dose not exist.");
        }
    }
}
