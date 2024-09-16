package day5;

import java.util.Scanner;

public class Str {
    //string is a squence of charaters
    //string is not a primitive datatype in java ,,,string is a class
    //strings are immutable in java ,,,means we cant change the string in memory
    //it will make a copy of the origanal string with the changes
    public static void main(String[] args) {
        //as string is a class not a data type that means we can also make a object
        //of a string class 
        String name =new String("sheth");
        System.out.println(name); 
        //java has special support for string,,that is we can use String class as a datatype like
        String name2="shethlok";
        System.out.println(name2);
        //taking input of string
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(st);

    }
}
