public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        contactManager.populateHashMap("src/main/resources/personalContacts.csv");
        //contactManager.populateHashMap("src/main/resources/workingContacts.csv");
        contactManager.addContacts();
        System.out.println("test");



    }
}
