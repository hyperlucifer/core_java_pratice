package day1;
import java.util.Scanner;

public class sumOfOddEven {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int even=0;
        int odd=0;
        while (num!=0) {
            int m=num%10;
            if (m%2==0) {
                even=even+m;
            }
            else{
                odd=odd+m;
            }
            num=num/10;
        }
        System.out.println("the addition of even number is "+even);
        System.out.println("the addition of odd number is "+odd);
    }
}
