package org.example;

import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UCE11{

    public static final String Name_Pattern = "^[A-Z][a-z]{2}";
    public static final String Email_Pattern = "^[a-zA-Z0-9]*@[a-zA-Z]+([.][a-zA-Z]+)+$";
    public static final String Mobile_Pattern = "^(0|9)[0-96-9]$";
    public static final String Password_Pattern = "^(?=,*[A-Z]+)(?=,*[A-Z]+)[a-z]{2}";

    public boolean validateFName(String fname) throws URegException{
        return patterChecker(fname,Name_Pattern);
    }
    public boolean validateemail(String email_id) throws URegException {
        return patterChecker(email_id, Email_Pattern);
    }
    public boolean validateLName(String lname) throws URegException{
        return patterChecker(lname,Name_Pattern);
    }
    public boolean validatePassword(String password) throws URegException{
        return patterChecker(password,Password_Pattern);
    }
    @Test
    public boolean patterChecker(String input,String fieldPattern) throws URegException{
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
