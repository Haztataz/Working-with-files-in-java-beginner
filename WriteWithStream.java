package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteWithStream {
    public static void main(String[] args) {
        String text = "Hello world";

        try(FileOutputStream output = new FileOutputStream("Test.txt")) {
            output.write(text.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
