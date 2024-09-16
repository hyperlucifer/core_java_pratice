package day28;

import java.util.Scanner;

interface Shape{

    double area(int r);
    
}

class circle implements Shape{

    
    public double area(int r){
        return 3.14*r*r;
    }

}

class sphere implements Shape{
    public double area(int r){
        return (4*3.14)*r*r;
    }
}

public class interfaceShape {
    static int accept(){
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("enter the radius ");
        r=sc.nextInt();
        return r;
    }
    public static void main(String[] args) {
        int r=accept();
        circle c=new circle();
        sphere s=new sphere();
        System.out.println("the area of circle is "+c.area(r));
        System.out.println("the area of sphere is "+s.area(r));
    }
}
