package day29;

import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<String,Integer> h1=new Hashtable<>();

        h1.put("ram", 234);
        h1.put("sham", 767);
        h1.put("rahul", 34);
        h1.put("rohan", 23);

       System.out.println(h1.get("ram")); 
    }
}
