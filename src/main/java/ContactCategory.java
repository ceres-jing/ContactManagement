public interface ContactCategory {
    public void addContact(String name, String phoneNumber,String email);
    public void removeContact(String name);
    public void viewContacts();
    public void searchContacts(String name);

}
