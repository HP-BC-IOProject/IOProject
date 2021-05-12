import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.exists;

public class IOProject {

    public static void printContacts(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContent = Files.readAllLines(filePath);
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

        Scanner scanner = new Scanner(System.in);

            // ASK HOW TO MAKE THIS INTO A VARIABLE!!

        System.out.println("Choose an option\n1. View contacts\n2. Add a New Contact\n3. Search a Contact by Name\n4. Delete an Existing Contact\n5. Exit Application");

        int userInput = scanner.nextInt();

            // NEED TO ASK ABOUT PUTTING ALL THIS IN A WHILE LOOP!!

        List<String> contactList = Files.readAllLines(PathtoContacts);

        if (userInput == 1) {

            for (int i = 0; i < contactList.size(); i += 1) {
                System.out.println((i + 1) + ": " + contactList.get(i));
            }

            // ASK ABOUT LINKING THIS TO LINE 40!

            System.out.println("Do you wish to continue?");
            String confirmUserInput = scanner.next();

            if (confirmUserInput.equals("y") || confirmUserInput.equals("yes")) {

            }

        } else if (userInput == 2) {
            System.out.println("Who would you like to add?");
            String userInput2 = scanner.next();
            Files.write(
                    Paths.get(contactDirectory, contactFile),
                    Arrays.asList(userInput2), // list with one item
                    StandardOpenOption.APPEND
            );

            // ASK ABOUT LINKING THIS TO LINE 40!!
            System.out.println("Do you wish to continue?");
            String confirmUserInput = scanner.next();

            if (confirmUserInput.equals("y") || confirmUserInput.equals("yes")) {

            }

        } else if (userInput == 3) {
            System.out.println("Who would you like to search for?");
            String searchUser = scanner.next();
            System.out.println(contactList.contains(searchUser));

            // ASK ABOUT LINKING THIS TO LINE 40!!
            System.out.println("Do you wish to continue?");
            String confirmUserInput = scanner.next();

            if (confirmUserInput.equals("y") || confirmUserInput.equals("yes")) {

            }

            // ASK HOW TO DO A DELETE METHOD FOR REMOVING A PERSON!
        } else if (userInput == 4) {
            System.out.println("Who would you like to delete?");
            String deleteUser = scanner.next();
            System.out.println(contactList.remove(deleteUser));

            // ASK ABOUT LINKING THIS TO LINE 40!!
            System.out.println("Do you wish to continue?");
            String confirmUserInput = scanner.next();

            if (confirmUserInput.equals("y") || confirmUserInput.equals("yes")) {

            }
        }



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

