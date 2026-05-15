import java.util.*;
import java.util.stream.Collectors;

// ================= PERSON CLASS =================
class Person {

    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    // Constructor
    public Person(String firstName,
                  String lastName,
                  String address,
                  String city,
                  String state,
                  String zip,
                  String phoneNumber,
                  String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Person
    @Override
    public String toString() {

        return "\nFirst Name : " + firstName +
                "\nLast Name : " + lastName +
                "\nAddress : " + address +
                "\nCity : " + city +
                "\nState : " + state +
                "\nZip : " + zip +
                "\nPhone : " + phoneNumber +
                "\nEmail : " + email;
    }

    // Duplicate Check
    @Override
    public boolean equals(Object obj) {

        Person person = (Person) obj;

        return this.firstName.equals(person.firstName)
                && this.lastName.equals(person.lastName);
    }
}

// ================= DIRECTORY CLASS =================
class Directory {

    List<Person> personList = new ArrayList<>();

    // Add Person
    public void addPerson(Person person) {

        if (personList.contains(person)) {

            System.out.println("Duplicate Person Found");
            return;
        }

        personList.add(person);

        System.out.println("Person Added Successfully");
    }

    // Display Persons
    public void displayPersons() {

        if (personList.isEmpty()) {

            System.out.println("No Persons Available");
            return;
        }

        for (Person person : personList) {

            System.out.println(person);
            System.out.println("----------------------");
        }
    }

    // Edit Person
    public void editPerson(String firstName,
                           Scanner scanner) {

        for (Person person : personList) {

            if (person.firstName.equalsIgnoreCase(firstName)) {

                System.out.println("Enter New City:");
                person.city = scanner.nextLine();

                System.out.println("Enter New State:");
                person.state = scanner.nextLine();

                System.out.println("Person Updated");
                return;
            }
        }

        System.out.println("Person Not Found");
    }

    // Delete Person
    public void deletePerson(String firstName) {

        boolean removed = personList.removeIf(
                person -> person.firstName.equalsIgnoreCase(firstName));

        if (removed) {

            System.out.println("Person Deleted");

        } else {

            System.out.println("Person Not Found");
        }
    }

    // Search By City
    public void searchByCity(String city) {

        List<Person> result = personList.stream()
                .filter(person ->
                        person.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());

        if (result.isEmpty()) {

            System.out.println("No Person Found");

        } else {

            result.forEach(System.out::println);
        }
    }

    // Search By State
    public void searchByState(String state) {

        List<Person> result = personList.stream()
                .filter(person ->
                        person.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());

        if (result.isEmpty()) {

            System.out.println("No Person Found");

        } else {

            result.forEach(System.out::println);
        }
    }

    // Count By City
    public void countByCity(String city) {

        long count = personList.stream()
                .filter(person ->
                        person.city.equalsIgnoreCase(city))
                .count();

        System.out.println("Count : " + count);
    }

    // Count By State
    public void countByState(String state) {

        long count = personList.stream()
                .filter(person ->
                        person.state.equalsIgnoreCase(state))
                .count();

        System.out.println("Count : " + count);
    }
}

// ================= MAIN CLASS =================
public class Q1Day22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Welcome to Address Book Program");

        // Multiple Directories
        Map<String, Directory> directories =
                new HashMap<>();

        // Create Directory
        System.out.println("Enter Directory Name:");
        String directoryName = scanner.nextLine();

        Directory directory =
                new Directory();

        directories.put(directoryName, directory);

        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Person");
            System.out.println("2. Display Persons");
            System.out.println("3. Edit Person");
            System.out.println("4. Delete Person");
            System.out.println("5. Search By City");
            System.out.println("6. Search By State");
            System.out.println("7. Count By City");
            System.out.println("8. Count By State");
            System.out.println("9. Exit");

            System.out.println("Enter Choice:");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:

                    // Add Person
                    System.out.println("Enter First Name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter Last Name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter Address:");
                    String address = scanner.nextLine();

                    System.out.println("Enter City:");
                    String city = scanner.nextLine();

                    System.out.println("Enter State:");
                    String state = scanner.nextLine();

                    System.out.println("Enter Zip:");
                    String zip = scanner.nextLine();

                    System.out.println("Enter Phone Number:");
                    String phone = scanner.nextLine();

                    System.out.println("Enter Email:");
                    String email = scanner.nextLine();

                    Person person = new Person(
                            firstName,
                            lastName,
                            address,
                            city,
                            state,
                            zip,
                            phone,
                            email);

                    directory.addPerson(person);

                    break;

                case 2:

                    // Display Persons
                    directory.displayPersons();

                    break;

                case 3:

                    // Edit Person
                    System.out.println(
                            "Enter First Name To Edit:");

                    String editName =
                            scanner.nextLine();

                    directory.editPerson(
                            editName,
                            scanner);

                    break;

                case 4:

                    // Delete Person
                    System.out.println(
                            "Enter First Name To Delete:");

                    String deleteName =
                            scanner.nextLine();

                    directory.deletePerson(deleteName);

                    break;

                case 5:

                    // Search By City
                    System.out.println(
                            "Enter City:");

                    String searchCity =
                            scanner.nextLine();

                    directory.searchByCity(searchCity);

                    break;

                case 6:

                    // Search By State
                    System.out.println(
                            "Enter State:");

                    String searchState =
                            scanner.nextLine();

                    directory.searchByState(searchState);

                    break;

                case 7:

                    // Count By City
                    System.out.println(
                            "Enter City:");

                    String countCity =
                            scanner.nextLine();

                    directory.countByCity(countCity);

                    break;

                case 8:

                    // Count By State
                    System.out.println(
                            "Enter State:");

                    String countState =
                            scanner.nextLine();

                    directory.countByState(countState);

                    break;

                case 9:

                    System.out.println("Exiting...");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 9);

        scanner.close();
    }
}