package org.example;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UCE4 {
    public static final String Mobile_Pattern = "^(0|9)[0-96-9]$";
    public boolean validateFName(String Mobile) throws URegException{
        return patterChecker(Mobile,Mobile_Pattern);
    }
    @Test
    private boolean patterChecker(String input,String fieldPattern) throws URegException{
        Pattern pattern=Pattern.compile(fieldPattern);
        Matcher matcher= pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new URegException(URegException.ExceptionType.ENTERED_INVALID, "give valid entry");
            return true;
        }
        catch (NullPointerException exception) {
            throw new URegException(URegException.ExceptionType.ENTERED_NULL, "Entry not null");
        }
    }
}

