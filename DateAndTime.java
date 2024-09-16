package day25;

import java.util.Date;

/*
 * java.time -->>package for date and time in java(after java 8 onwards)
 * 
 * befour java 8 ,java.util package used to hold the date and time classes ,,now these 
 * classes are depricated
 * 
 * Date in java is stored in the form of a long number.this long number holds the number of miliseconds
 * passed scince 1 jan 1970
 * 
 * java assumes that 1900 is the start year which means it calculates years passed since 1900
 * wherever we ask it for years passed
 * 
 */

public class DateAndTime {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis());//returns the miliseconds since 1970
        // System.out.println(Long.MAX_VALUE);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        //these all methods are depracked
    }
}
