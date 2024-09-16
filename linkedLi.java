package day23;

import java.util.LinkedList;

public class linkedLi {
    public static void main(String[] args) {
        LinkedList<Integer> l1 =new LinkedList<>();//no inatial capacity in ll
        LinkedList<Integer> l2 =new LinkedList<>();//no inatial capacity in ll

        l2.add(12);
        l2.add(12);
        l2.add(12);
        l2.add(12);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(0,6);//this will add a element at a specific index 
        l1.add(0,7);//this will not overwrite the element at index ,,it will swift the previous 
                        //and add the new element
        l1.addLast(65);
        l1.addFirst(65);
        l1.set(1,12);//it will delete the origanal value add replace it with new one

        l1.remove(2);//it will remove the element at a specific index
        System.out.println(l1.contains(2));//return true if the element is present in the list
        System.out.println(l1.indexOf(3));//it will return the index if the specific element

       // l1.addAll(l2);//it will ad the element from end of the l1
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));//.get method is used to get elements inside the arraylist
        }

    }
}
