package day1;
import java.io.*;
import java.util.Scanner;
public class input {
    public static void main(String[] args)throws IOException
    {
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("enter the first number ");
        // int a=Integer.parseInt(br.readLine());
        // System.out.println("enter the second number ");
        // int b=Integer.parseInt(br.readLine());
        // int c=a+b;
        // System.out.println("addition is "+c);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the first number ");
        int a=sc.nextInt();
        System.out.println("enter the second number ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("addition is "+c);
    }
}
