import MoodanalysisException.UC2MoodAnalaException;

import org.junit.Assert;
import org.junit.Test;


public class UC2MoodAnala {
    private String message;

    public  UC2MoodAnala(String message){

        this.message=message;
    }

    public String analyserMood(Object o) {
        this.message=message;
        return analyserMood(null);
    }
@Test
public void NULLMoodShouldReturnHappyThrowException(){
    UC2MoodAnala moodAnalyser=new UC2MoodAnala(null);
    try{
        UC2MoodAnala.analyserMood(null);
    }
    catch (UC2MoodAnalaException){
        Assert.assertEquals(UC2MoodAnalaException.ExceptionType.enterNull,e.type);
    }
    String mood=moodAnalyser.analyserMood(null);
    Assert.assertEquals("HAPPY",mood);
}
   @Test
    public String analysermood() throws UC2MoodAnalaException {
        try{
            if(message.length()==0) {
                throw new UC2MoodAnalaException (UC2MoodAnalaException.ExceptionType.enterEmpty,"eneter proper mood");
            }
            if(message.contains("sad"))
                return  "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e){
            throw new UC2MoodAnalaException (UC2MoodAnalaException.ExceptionType.enterNull,"eneter proper mood");
        }
    }
}