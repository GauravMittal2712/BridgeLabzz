import java.util.*;

// Contact Class (UC1)
class Contact {
    String firstName, lastName, address, city, state, email;
    int zip;
    long phone;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, int zip, long phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + ", " + address + ", " +
                city + ", " + state + ", " + zip + ", " + phone + ", " + email);
    }
}

// AddressBook Class (UC2–UC5)
class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Add Contact (UC2)
    public void addContact() {
        System.out.println("Enter First Name:");
        String first = sc.next();
        System.out.println("Enter Last Name:");
        String last = sc.next();
        System.out.println("Enter Address:");
        String address = sc.next();
        System.out.println("Enter City:");
        String city = sc.next();
        System.out.println("Enter State:");
        String state = sc.next();
        System.out.println("Enter Zip:");
        int zip = sc.nextInt();
        System.out.println("Enter Phone:");
        long phone = sc.nextLong();
        System.out.println("Enter Email:");
        String email = sc.next();

        contacts.add(new Contact(first, last, address, city, state, zip, phone, email));
        System.out.println("Contact Added!");
    }

    // Display Contacts
    public void displayContacts() {
        for (Contact c : contacts) {
            c.display();
        }
    }

    // Edit Contact (UC3)
    public void editContact(String name) {
        for (Contact c : contacts) {
            if (c.firstName.equals(name)) {
                System.out.println("Editing Contact...");
                System.out.println("Enter New City:");
                c.city = sc.next();
                System.out.println("Enter New Phone:");
                c.phone = sc.nextLong();
                return;
            }
        }
        System.out.println("Contact Not Found!");
    }

    // Delete Contact (UC4)
    public void deleteContact(String name) {
        contacts.removeIf(c -> c.firstName.equals(name));
        System.out.println("Contact Deleted (if existed)");
    }
}
public class Day10Q2 {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner sc = new Scanner(System.in);

        // UC6 → Multiple Address Books using HashMap
        HashMap<String, AddressBook> addressBooks = new HashMap<>();

        while (true) {
            System.out.println("\n1. Add Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Address Book Name:");
                    String name = sc.next();
                    addressBooks.put(name, new AddressBook());
                    System.out.println("Address Book Created!");
                    break;

                case 2:
                    System.out.println("Enter Address Book Name:");
                    String bookName = sc.next();

                    AddressBook book = addressBooks.get(bookName);

                    if (book == null) {
                        System.out.println("Not Found!");
                        break;
                    }

                    // Inside selected address book
                    while (true) {
                        System.out.println("\n1.Add 2.Display 3.Edit 4.Delete 5.Back");
                        int op = sc.nextInt();

                        switch (op) {
                            case 1:
                                book.addContact();
                                break;
                            case 2:
                                book.displayContacts();
                                break;
                            case 3:
                                System.out.println("Enter First Name:");
                                book.editContact(sc.next());
                                break;
                            case 4:
                                System.out.println("Enter First Name:");
                                book.deleteContact(sc.next());
                                break;
                            case 5:
                                break;
                        }
                        if (op == 5) break;
                    }
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}