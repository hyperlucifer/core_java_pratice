package day1;
import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num= sc.nextInt();
        int fac=1;
        for(int i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
