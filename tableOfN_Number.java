package day1;
import java.util.Scanner;

public class tableOfN_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
