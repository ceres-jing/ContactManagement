import java.util.ArrayList;
import java.util.HashMap;

public class PersonalContactCategory implements ContactCategory{

    public void addContact(){};
    public void removeContact(String name){
        personalContactMap.remove(name);
    }
    public void viewContacts(){};
    public void searchContacts(){};

    HashMap<String,Contact> personalContactMap = new HashMap<>();






}
