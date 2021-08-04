package MoodanalysisException;

public class UserRegistration extends Exception {
    static String message;

    enum ExceptionType {
        ENTERED_NULL, ENTERED_TYPE
    }
    ExceptionType type;
    public void UserRegistrationException(ExceptionType type.String message) {
        super(message);
        this.type = type;
    }
}