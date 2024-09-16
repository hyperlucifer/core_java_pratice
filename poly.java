package day30;

import java.util.Scanner;

interface area1 {
    double area();

}

class Rectrangle implements area1 {

    int l, b;

    Rectrangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breath ");
        l = sc.nextInt();
        b = sc.nextInt();
    }

    public double area() {
        int a=l * b;
        System.out.println("the area if rectrangle is "+a);
        return a;
    }

}

class square extends Rectrangle {

    int s;

    square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of square");
        this.s = sc.nextInt();

    }

    public double area() {
        int a=s * s;
        System.out.println("the area if square is "+a);
        return a;
    }
   
}

class circle implements area1 {

    int r;

    circle() {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }

    public double area() {
        return Math.PI * r * r;
    }
    void display(){
        System.out.println("the area if circle is "+area());
    }

}

public class poly {
    public static void main(String[] args) {
        Rectrangle sq = new square();
        sq.area();
    }
}
