import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileHandling {
    public static void main(String[] args) {

        // ? Creating a new file using File class
        File file = new File("hello.txt");
        try {
            file.createNewFile(); // Creates a new file if it doesn't exist

        } catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        // ? Writing to a file (FileWriter) (Overwrites the file)
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello, World!\n");

            // ? Closing the writer
            writer.close();

        } catch (IOException e) {
            System.out.println("Unable to write to file");
            e.printStackTrace();
        }

        // ? Reading from a file (Scanner)
        File file2 = new File("hello.txt");
        System.out.print("Data read from file: ");
        try {
            Scanner sc = new Scanner(file2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Unable to read from file");
            e.printStackTrace();
        }

        // ? Deleting a file
        File file3 = new File("hello.txt");
        if (file3.delete())
            System.out.println("File deleted successfully");
        else
            System.out.println("Unable to delete file");

    }
}
