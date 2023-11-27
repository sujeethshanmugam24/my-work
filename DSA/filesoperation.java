import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        File directory = new File("C:\\Users\\91880\\OneDrive\\Desktop\\temp\\sam2");

        boolean directoryCreated = directory.mkdir();
        if (directoryCreated) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Failed to create directory");
        }
        try {
            File file = new File("C:\\Users\\91880\\OneDrive\\Desktop\\temp\\sam2\\sarish.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("Is file readable? " + file.canRead());
            System.out.println("Is file writable? " + file.canWrite());
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");

            FileWriter myWriter = new FileWriter("C:\\Users\\91880\\OneDrive\\Desktop\\temp\\sam2\\sarish.txt");
            myWriter.write("Sanny  might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            System.out.println("File size in bytes " + file.length());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
