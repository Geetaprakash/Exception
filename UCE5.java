package org.example;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UCE5 {
        public static final String Password_Pattern = "^(?=,*[A-Z]+)(?=,*[A-Z]+)[a-z]{2}";
        public boolean validatePassword(String password) throws URegException{
            return patternChecker(password,Password_Pattern);
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

