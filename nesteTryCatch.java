package day21;

import java.util.Scanner;

/*
 * we use nested try when we want to handel a specific exception and continue the try
 * block
 */

public class nesteTryCatch {
    public static void main(String[] args) {

        int marks[] = new int[5];
        marks[0] = 23;
        marks[1] = 45;
        marks[2] = 54;
        marks[3] = 2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of index");
        int ind=sc.nextInt();
        try {
            System.out.println("shethlog");
            
            try {
            
                System.out.println(marks[ind]);
            }
             catch (ArrayIndexOutOfBoundsException e) {
            
                System.out.println("sorry this index dose not exist");
                System.out.println("exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("exception in level 1");
        }
    }
}
