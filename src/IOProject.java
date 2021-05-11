import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.exists;

public class IOProject {
    
    public static void printContacts(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContent  = Files.readAllLines(filePath);
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContent.get(i));
        }
    }

    public static void main(String[] args) throws IOException {

        String contactDirectory = "./src/";
        String contactFile = "contacts.txt";

        Path PathtoContacts = Paths.get(contactDirectory, contactFile);
        // Prints out file path
        System.out.println("PathtoContacts = " + PathtoContacts);
        Files.exists(PathtoContacts);

        List<String> newContacts = Arrays.asList("Jeff", "Harry", "Bob"); //Making the list!
        System.out.println("newContacts = " + newContacts);

        Files.write(PathtoContacts, newContacts);

//    System.out.println("PathtoContacts = " + PathtoContacts);
//
//        String filename = "contacts.txt";
//
//        Path contactPath = Paths.get(filename);
//
//        List<String> contacts = Arrays.asList("Brett", "Hunter", "Kenneth", "Douglas", "Larry");
//        System.out.println("contacts = " + contacts);
//
//        Files.write(contactPath, contacts);
//
//        System.out.println();

//        System.out.println("Do you want to add a person?");



    }
}
