package org.example;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UCE2{
        public static final String Email_Pattern = "^[a-zA-Z0-9]*@[a-zA-Z]+([.][a-zA-Z]+)+$";
        public boolean validateemail(String email_id) throws URegException{
            return patterChecker(email_id,Email_Pattern);
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

