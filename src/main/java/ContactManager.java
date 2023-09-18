import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


// 1. read the csv file.
// 2. contactManager is able to switch into different categories.
// 3. do all the function
// 4. save the output into the csv.

public class ContactManager {
    PersonalContactCategory personalContactCategory = new PersonalContactCategory();
    WorkContactCategory workContactCategory = new WorkContactCategory();

    ContactCategory currentCategory;
    HashMap<String,Contact> currentHashMap ;
    Scanner myScanner = new Scanner(System.in);


    public HashMap<String,Contact> selectCategory(){
        System.out.println("please select which category you want to switch, work or personal");
        String userCategory=myScanner.nextLine();
        switch (userCategory.toLowerCase()){
            case "work" ->
            {currentHashMap = workContactCategory.workContactMap; }
            case "personal" ->
            {currentHashMap = personalContactCategory.personalContactMap;
            }
        }

        return currentHashMap;

    };

    public HashMap<String,Contact> populateHashMap(String filePath ) {

        currentHashMap=selectCategory();

        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split(",");
                String name = tokens[0];
                String phoneNumber = tokens[1];
                String email = tokens[2];
                Contact contact = new Contact(name, phoneNumber, email);
                currentHashMap.put(name, contact);
            }
            System.out.println("csv file has been read successfully and populate a hashmap ");

            //workContactCategory.addContact(currentHashMap,"rui","rui@gmail.com","079335668299");
            //System.out.println("this new contact has been added");


        } catch (FileNotFoundException fnfe) {
            System.err.println("No matched file found " + "\n" + fnfe.getMessage());
        }

        return currentHashMap;



        }

        void addContacts(){
            System.out.println("Add new contacts");
            System.out.println("Please enter new contact's name:");
            String name = myScanner.nextLine();
            System.out.println("Please enter new contact's phone number:");
            String phoneNumber = myScanner.nextLine();
            System.out.println("Please enter new contact's email address:");
            String emailAddress = myScanner.nextLine();
            Contact newContact = new Contact(name,phoneNumber,emailAddress);
            currentHashMap.put(name,newContact);


        }


//    public void writeToCSV() {
//
//        HashMap<String,Contact> data = populateHashMap("src/main/resources/personalContacts.csv");
//        Map<String, Contact> dataMap = new HashMap<>();
//
//
//        String csvFilePath = "data.csv";
//
//        try {
//            FileWriter csvWriter = new FileWriter(csvFilePath);
//            for (Map.Entry<String,Contact > entry : data.entrySet()) {
//                String key = entry.getKey();
//                Contact values = entry.getValue();
//                csvWriter.append(key);
//                for (String value : values) {
//                    csvWriter.append("," + value);
//                }
//                csvWriter.append("\n");
//            }
//
//
//
//            csvWriter.close();
//
//            System.out.println("Data has been written to " + csvFilePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }






}
