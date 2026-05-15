import java.util.regex.Pattern;

// Custom Exception Class
class MoodAnalysisException extends Exception {

    enum ExceptionType {
        NULL_MOOD,
        EMPTY_MOOD
    }

    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

// Mood Analyzer Class
class MoodAnalyser {

    private String message;

    // Default Constructor
    public MoodAnalyser() {
    }

    // Parameterized Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Analyse Mood Method
    public String analyseMood() throws MoodAnalysisException {

        try {

            if (message.length() == 0) {
                throw new MoodAnalysisException(
                        MoodAnalysisException.ExceptionType.EMPTY_MOOD,
                        "Mood should not be Empty");
            }

            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }

        } catch (NullPointerException e) {

            throw new MoodAnalysisException(
                    MoodAnalysisException.ExceptionType.NULL_MOOD,
                    "Mood should not be Null");
        }
    }
}

// User Registration Class
class UserRegistration {

    // First Name Validation
    public boolean validateFirstName(String firstName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, firstName);
    }

    // Last Name Validation
    public boolean validateLastName(String lastName) {

        String regex = "^[A-Z][a-z]{2,}$";

        return Pattern.matches(regex, lastName);
    }

    // Email Validation
    public boolean validateEmail(String email) {

        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$";

        return Pattern.matches(regex, email);
    }

    // Mobile Validation
    public boolean validateMobile(String mobile) {

        String regex = "^[0-9]{2}\\s[0-9]{10}$";

        return Pattern.matches(regex, mobile);
    }

    // Password Validation
    public boolean validatePassword(String password) {

        String regex =
                "^(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$).{8,}$";

        return Pattern.matches(regex, password);
    }
}

// Main Class
public class Q1Day21 {

    public static void main(String[] args) {

        // Mood Analyzer
        try {

            MoodAnalyser mood1 =
                    new MoodAnalyser("I am in Sad Mood");

            System.out.println("Mood 1 : "
                    + mood1.analyseMood());

            MoodAnalyser mood2 =
                    new MoodAnalyser("I am in Happy Mood");

            System.out.println("Mood 2 : "
                    + mood2.analyseMood());

            MoodAnalyser mood3 =
                    new MoodAnalyser("");

            System.out.println("Mood 3 : "
                    + mood3.analyseMood());

        } catch (MoodAnalysisException e) {

            System.out.println("Exception : "
                    + e.getMessage());
        }

        System.out.println();

        // User Registration Validation
        UserRegistration user =
                new UserRegistration();

        // First Name
        System.out.println("First Name : "
                + user.validateFirstName("John"));

        // Last Name
        System.out.println("Last Name : "
                + user.validateLastName("Smith"));

        // Email
        System.out.println("Email : "
                + user.validateEmail("abc.xyz@bl.co.in"));

        // Mobile
        System.out.println("Mobile : "
                + user.validateMobile("91 9919819801"));

        // Password
        System.out.println("Password : "
                + user.validatePassword("Abcd@123"));
    }
}
