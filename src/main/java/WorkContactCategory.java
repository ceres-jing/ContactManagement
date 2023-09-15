import java.util.ArrayList;
import java.util.HashMap;

public class WorkContactCategory implements ContactCategory{

    public void addContact(String name, String email, String phoneNumber){
        Contact newContact = new Contact(name,email,phoneNumber);
        workContactMap.put(name,newContact);
    }
    public void removeContact(String name){
        workContactMap.remove(name);
    }

    public void searchContacts(String name){
        workContactMap.get(name);
    }
    public void viewContacts(){
        ArrayList<Contact> listOfContacts = new ArrayList<>(workContactMap.values());
        for (Contact contact:
             listOfContacts) {
            System.out.println(contact);

        }

    }

    HashMap<String,Contact> workContactMap = new HashMap<>();



}
