class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Contacts contact = new Contacts();
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setAddress("123 Main St");
        contact.setCity("Anytown");
        contact.setState("CA");
        contact.setZip("12345");
        contact.setPhoneNumber("555-1234");
        contact.setEmail("johndoe@example.com");
        System.out.println(contact);
    }
}