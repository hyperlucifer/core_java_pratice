package day25;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * calender class is a abstract class ,,so we can't make an object of it
 * but there is a one static method called getInstance() in it ,,that gives us a instance of a class. 
 * gregory is a concriate class
 */

public class calenderClass {
    public static void main(String[] args) {
        // Calendar c=Calendar.getInstance();
        // System.out.println();
        // System.out.println(c.getCalendarType());//this will give he standerd time zone of the divice
        // System.out.println(c.getTimeZone());
        // Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));//to change the time zone we use
        Calendar c=Calendar.getInstance();
        System.out.println();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
