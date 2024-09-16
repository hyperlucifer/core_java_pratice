package day1;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int flag=1;
        for(int i=2;i<=num;i++){
            if (num%i==0) {
                flag++;
            }
        }
        if (flag==2) {
            System.out.println("the number is prime ");
        }
        else{
            System.out.println("the number is not prime");
        }
    }
}
