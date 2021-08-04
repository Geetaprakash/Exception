package MoodanalysisException;

public class UC2MoodAnalaException extends Exception {
    public enum ExceptionType {
        enterNull,enterEmpty;
    }
    ExceptionType type;
    public UC2MoodAnalaException(ExceptionType type ,String message){
        super(message);
        this.type=type;
    }
}
