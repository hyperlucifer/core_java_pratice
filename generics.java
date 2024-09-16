package day26;

import java.util.ArrayList;


public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> aList =new ArrayList<>();//generics is used to tell compiler which type of data 
                                                    //we are going to store in our lists
                                                    //else it will store the values as an object
                                                    //dont write any premetive data type here eg int
        aList.add(21);
        aList.add(1);

        int a =aList.get(2);
    }
}
