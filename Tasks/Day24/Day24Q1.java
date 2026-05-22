import java.util.ArrayList;
import java.util.Scanner;

class Contact11 {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    // Constructor
    Contact11(String firstName, String lastName, String address,
              String city, String state, int zip,
              long phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Method
    void display() {
        System.out.println("\n--------------------");
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name  : " + lastName);
        System.out.println("Address    : " + address);
        System.out.println("City       : " + city);
        System.out.println("State      : " + state);
        System.out.println("Zip        : " + zip);
        System.out.println("Phone No   : " + phoneNumber);
        System.out.println("Email      : " + email);
    }
}

public class Day24Q1 {

    static ArrayList<Contact11> contact11s = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // UC2 - Add Contact
    static void addContact() {

        System.out.println("\nEnter First Name:");
        String firstName = sc.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter City:");
        String city = sc.nextLine();

        System.out.println("Enter State:");
        String state = sc.nextLine();

        System.out.println("Enter Zip:");
        int zip = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Phone Number:");
        long phone = Long.parseLong(sc.nextLine());

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        Contact11 person = new Contact11(firstName, lastName,
                address, city, state, zip, phone, email);

        contact11s.add(person);

        System.out.println("Contact Added Successfully!");
    }

    // UC3 - Edit Contact
    static void editContact() {

        System.out.println("\nEnter First Name to Edit:");
        String name = sc.nextLine();

        for (Contact11 person : contact11s) {

            if (person.firstName.equalsIgnoreCase(name)) {

                System.out.println("Enter New City:");
                person.city = sc.nextLine();

                System.out.println("Contact Updated!");
                return;
            }
        }

        System.out.println("Contact Not Found!");
    }

    // UC4 - Delete Contact
    static void deleteContact() {

        System.out.println("\nEnter First Name to Delete:");
        String name = sc.nextLine();

        boolean removed = contact11s.removeIf(person ->
                person.firstName.equalsIgnoreCase(name));

        if (removed) {
            System.out.println("Contact Deleted!");
        } else {
            System.out.println("Contact Not Found!");
        }
    }

    // Display All Contacts
    static void displayContacts() {

        if (contact11s.isEmpty()) {
            System.out.println("No Contacts Available!");
            return;
        }

        System.out.println("\nAll Contacts:");

        for (Contact11 person : contact11s) {
            person.display();
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            System.out.println("Enter Your Choice:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addContact();
                    break;

                case 2:
                    editContact();
                    break;

                case 3:
                    deleteContact();
                    break;

                case 4:
                    displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}