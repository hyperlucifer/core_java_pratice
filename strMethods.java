package day5;

public class strMethods {
    //string methods are use to manlipulate the string
    //it will not change the orignal but it will return the changed copy of that string
    public static void main(String[] args) {
        String name="shethLoka";
        //.length() will return the length of the String
        System.out.println("the length of the string is "+name.length());
        //.toLowerCase() will return a new string which has all the lowercase characters 
        //from the string 
         String lString=name.toLowerCase();
        System.out.println("the lowercase is "+lString); 
        //.toUpperCase() will return a new string which has all the Uppercase characters 
        //from the string 
        String uString=name.toUpperCase();
        System.out.println("the uppercase characters are "+uString);
        //.trim() will return a string after removeing all the spaces
        String tString=name.trim();
        System.out.println("the trimed string is "+tString);
        //.substring will return a sring from the passed starting index to end 
        //the index starts from 0
        String subString1 = name.substring(5);
        System.out.println("the substring is "+subString1);
        //.substring returns a substring from start index to end index but start index is included 
        //end index is excluded
        String subString2 = name.substring(5,8);
        System.out.println("the substring2 is "+subString2);
        //.replace returns new string after replacing first passed character to second passed character
        String strreplace=name.replace("s","d" );
        String strreplace2=name.replace("shet","dar" );
        System.out.println("the replaced name is "+strreplace);
        System.out.println("the replaced2 name is "+strreplace2);
        //.startsWith() it will check weather the string starts with the passed characters
        //it will return boolean value
        boolean strstart=name.startsWith("she");
        System.out.println(strstart);
        //.endsWith() it will check weather the string ends with the passed characters
        //it will return boolean value
        boolean strend=name.endsWith("lok");
        System.out.println(strend);
        //.charAt returns the character at the given index position
        char pos=name.charAt(3);
        System.out.println("the character at the position is "+pos);
        //indexOf returns the index of the passed charater in string
        System.out.println(name.indexOf("s"));
        //.equalsIgnoreCase() it will check weather the passed string is equal to 
        //the origanal string by ignoring case
        System.out.println(name.equalsIgnoreCase("sfjk"));
    }
}
