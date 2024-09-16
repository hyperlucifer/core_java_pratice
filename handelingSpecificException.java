package day20;

import java.util.Scanner;

public class handelingSpecificException {
    public static void main(String[] args) {
        int marks[]=new int[3];
        marks[0]=12;
        marks[1]=2;
        marks[2]=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array index");
        int ind=sc.nextInt();
        System.out.println("enter the number you want to divide with ");
        int num=sc.nextInt();
        try {
            System.out.println("the value at the index entered is "+marks[ind]); //this line an give array index out of bound evception
            System.out.println("the value of array-value/number is "+marks[ind]/num);//and this line may give arithmatic error
            
        } 
        catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("ArrayIndexOutOfBoundsException"); 
            System.out.println(e);
        }
        catch (ArithmeticException  e) {
            System.out.println("ArithmeticException"); 
            System.out.println(e);
        }
        catch (Exception  e) {
            System.out.println("some outher exception occur"); 
            System.out.println(e);
        }
        System.out.println("ccdf");
        
    }
}
