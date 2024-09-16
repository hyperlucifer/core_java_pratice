package day25;

import java.util.Calendar;
import java.util.GregorianCalendar;

//gregorian calendar is a concrate class,, but the calendar is a abstract class  
public class gregorianCalenderClass {
    public static void main(String[] args) {
        
        GregorianCalendar cal =new GregorianCalendar();
        System.out.println(cal.isLeapYear(2016));
    }
}
