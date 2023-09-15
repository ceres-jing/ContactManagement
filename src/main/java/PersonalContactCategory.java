import java.util.ArrayList;
import java.util.HashMap;

public class PersonalContactCategory implements ContactCategory{

    public void addContact(String name, String email, String phoneNumber){
        Contact newContact = new Contact(name,email,phoneNumber);
        personalContactMap.put(name,newContact);
    }
    public void removeContact(String name){
        personalContactMap.remove(name);
    }
    public void viewContacts(){
        ArrayList<Contact> listOfContacts = new ArrayList<>(personalContactMap.values());
        for (Contact contact:
             listOfContacts) {
            System.out.println(contact);

        }

    }
    public void searchContacts(){}

    HashMap<String,Contact> personalContactMap = new HashMap<>();






}
