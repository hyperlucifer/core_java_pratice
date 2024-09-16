package day1;
import java.util.Scanner;

public class paladromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int digit=num;
        int rev=0;
        while (digit!=0) {
            int m=digit%10;
            rev=m+(rev*10);
            digit=digit/10;
        }
       if (rev==num) {
            System.out.println("the number is palidrome");
       }
       else{
            System.out.println("the number is not a palidrome");
       }
    }
}
