package day1;
import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number ");
        float num1=sc.nextInt();
        System.out.println("Enter the opeator ");
        String op=sc.next();
        System.out.println("enter the second number ");
        float num2=sc.nextInt();

        switch (op) {
            case "+":
                System.out.println(num1+" "+op+" "+num2+" = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1+" "+op+" "+num2+" = "+(num1-num2));
                break;
            case "*":
                System.out.println(num1+" "+op+" "+num2+" = "+(num1*num2));
                break;
            case "/":
                System.out.println(num1+" "+op+" "+num2+" = "+(num1/num2));
                break;
            case "%":
                System.out.println(num1+" "+op+" "+num2+" = "+(num1%num2));
                break;
            
        }
    }
}
