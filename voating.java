package day52;

import java.util.Scanner;

public class voating {
    public static void main(String[] args) throws Exception {
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the candidate age ");
        age =sc.nextInt();
            if (age>=18) {
                System.out.println("you are ready to vote");
            }
            else{
                throw new Exception("invalid age"); 
            }
    }
}
