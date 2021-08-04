package MoodanalysisException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UerReg2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Z]{3}");
        Matcher lastName = p.matcher("geetashivaRAJ");
        while (lastName.find()) {
            System.out.println("valid");
        }
}
