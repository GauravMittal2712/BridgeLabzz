import java.util.regex.*;

public class Q1Day19 {

    // UC1 - First Name
    public static boolean validateFirstName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", name);
    }

    // UC2 - Last Name
    public static boolean validateLastName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", name);
    }

    // UC3 - Email
    public static boolean validateEmail(String email) {
        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$",
                email);
    }

    // UC4 - Mobile Number
    public static boolean validateMobile(String mobile) {
        return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
    }

    // UC5 to UC8 - Password Rules
    public static boolean validatePassword(String password) {

        // Minimum 8 characters
        String rule1 = ".{8,}";

        // At least 1 uppercase
        String rule2 = "(?=.*[A-Z]).{8,}";

        // At least 1 numeric number
        String rule3 = "(?=.*[A-Z])(?=.*[0-9]).{8,}";

        // Exactly 1 special character
        String rule4 = "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

        return Pattern.matches(rule4, password);
    }

    public static void main(String[] args) {

        // First Name
        System.out.println(validateFirstName("John"));

        // Last Name
        System.out.println(validateLastName("Smith"));

        // Email
        System.out.println(validateEmail("abc.xyz@bl.co.in"));

        // Mobile
        System.out.println(validateMobile("91 9919819801"));

        // Password
        System.out.println(validatePassword("Abcd@123"));
    }
}
