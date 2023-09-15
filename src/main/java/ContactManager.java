import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

    PersonalContactCategory personalContactCategory = new PersonalContactCategory();
    WorkContactCategory workContactCategory = new WorkContactCategory();

    ContactCategory currentCategory;

    public void populateHashMap(String filePath ){

            try (Scanner fileScanner = new Scanner( new File(filePath )))
            {
                while(fileScanner.hasNextLine())
                {
                    String line = fileScanner.nextLine();
                    String[] tokens = line.split(",");
                    String name = tokens[0];
                    String phoneNumber = tokens[1];
                    String email = tokens[2];

                }
            }
            catch (FileNotFoundException fnfe)
            {
                System.err.println("No matched file found " + "\n"+ fnfe.getMessage()) ;
            }







        };








}
