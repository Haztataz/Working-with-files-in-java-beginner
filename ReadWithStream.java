package File;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadWithStream {
    public static void main(String[] args) {
        try(FileInputStream input = new FileInputStream("Test.txt")) {
            int i;

            while((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
