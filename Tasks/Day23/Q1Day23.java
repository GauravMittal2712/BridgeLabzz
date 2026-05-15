import java.util.regex.Pattern;

public class Q1Day23 {

    // First Name Validation
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);
    }

    // Last Name Validation
    public boolean validateLastName(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }

    // Email Validation
    public boolean validateEmail(String email) {
        return Pattern.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$", email);
    }

    // Mobile Number Validation
    public boolean validateMobile(String mobile) {
        return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
    }

    // Password Rule 1 -> Minimum 8 Characters
    public boolean validatePasswordRule1(String password) {
        return Pattern.matches(".{8,}", password);
    }

    // Password Rule 2 -> At least 1 Uppercase
    public boolean validatePasswordRule2(String password) {
        return Pattern.matches(".*[A-Z].*", password);
    }

    // Password Rule 3 -> At least 1 Numeric Number
    public boolean validatePasswordRule3(String password) {
        return Pattern.matches(".*[0-9].*", password);
    }

    // Password Rule 4 -> Exactly 1 Special Character
    public boolean validatePasswordRule4(String password) {
        return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.[@#$%^&+=!])(?!.[@#$%^&+=!].[@#$%^&+=!]).{8,}$", password);
    }

    public static void main(String[] args) {

        Q1Day23 user = new Q1Day23();

        System.out.println("First Name: " +
                user.validateFirstName("John"));

        System.out.println("Last Name: " +
                user.validateLastName("Doe"));

        System.out.println("Email: " +
                user.validateEmail("abc.xyz@bl.co.in"));

        System.out.println("Mobile: " +
                user.validateMobile("91 9876543210"));

        System.out.println("Password Rule1: " +
                user.validatePasswordRule1("Password1@"));

        System.out.println("Password Rule2: " +
                user.validatePasswordRule2("Password1@"));

        System.out.println("Password Rule3: " +
                user.validatePasswordRule3("Password1@"));

        System.out.println("Password Rule4: " +
                user.validatePasswordRule4("Password1@"));
    }
}