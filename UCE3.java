package org.example;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UCE3 {
        public static final String Name_Pattern = "^[A-Z][a-z]{2}";
        public boolean validateLName(String lname) throws URegException{
            return patternChecker(lname,Name_Pattern);
        }
        @Test
        private boolean patternChecker(String input,String fieldPattern) throws URegException{
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
