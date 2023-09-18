import java.util.ArrayList;
import java.util.HashMap;

public class WorkContactCategory implements ContactCategory{

    HashMap<String,Contact> workContactMap = new HashMap<>();
    public void addContact(HashMap<String,Contact> workContactMap, String name, String email, String phoneNumber){
        Contact newContact = new Contact(name,email,phoneNumber);
        workContactMap.put(name,newContact);
    }
    public void removeContact(HashMap<String,Contact> workContactMap,String name){
        workContactMap.remove(name);
    }

    public void searchContacts(HashMap<String,Contact> workContactMap,String name){
        workContactMap.get(name);
    }
    public void viewContacts(HashMap<String,Contact> workContactMap){
        ArrayList<Contact> listOfContacts = new ArrayList<>(workContactMap.values());
        for (Contact contact:
             listOfContacts) {
            System.out.println(contact);
        }

    }


    @Override
    public void addContact(String name, String phoneNumber, String email) {

    }

    @Override
    public void removeContact(String name) {

    }

    @Override
    public void viewContacts() {

    }

    @Override
    public void searchContacts(String name) {

    }
}
