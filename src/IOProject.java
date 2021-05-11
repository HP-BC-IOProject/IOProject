public class IOProject {
    
    public static void printContacts(Path filePath) throws IOProject {
        System.out.println();
        List<String> fileContent  = Files.readAllLines(filePath);
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContent.get(i));
        }
    }

    public static void main(String[] args) throws IOProject {
        
        Path PathtoContacts = Paths.get("./src/contacts.txt");
        // Prints out file path
        System.out.println("PathtoContacts = " + PathtoContacts);
        files.exists(PathtoContacts) System.out.println("PathtoContacts = " + PathtoContacts);
        
        String filename = "contacts.txt";

        Path contactPath = Paths.get(directory, filename);

        List<String> contacts = Arrays.asList("Brett", "Hunter", "Kenneth", "Douglas", "Larry")
        System.out.println("contacts = " + contacts);

        Files.write(contactPath, contacts);

        System.out.println();

        System.out.println("Do you want to add a person?")



    }
}
