package day27;

import java.util.Scanner;

abstract class shape{
    abstract int area(int length,int breath); 
}

class rectangle extends shape{
    int area(int length,int breath){
        return length*breath;
    }
}
class triangle extends shape{
    int area (int length,int breath){
        return (length*breath)/2;
    }
}
public class queation {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        triangle t=new triangle();
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the length ");
        int l=sc.nextInt();
        
        System.out.println("enter the breath ");
        int b=sc.nextInt();

       System.out.println("the area of rectrangle is "+r.area(l, b));
       System.out.println("the area of triangle is "+t.area(l, b));

    }
}
