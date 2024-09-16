package day7;

import java.util.Scanner;

import day1.sumOfOddEven;

public class area {
    //for circle
    static Double are(Double r){
       
        return 3.14*r*r;
    }
    // for rectrangle
    public Double are(Double l,Double w){
        return l*w;
    }
    //for triangle
    public Double are(Double half,Double base ,Double height){
        return half*base*height;
    }

    public Double are(int r){
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        area ar =new area();
        System.out.println("Enter the reduis");
        Double radius =sc.nextDouble();
        System.out.println("the area of a circle is "+ar.are(radius));
        System.out.println("enter the base and height ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double half=2/height;
        System.out.println("the area of triangle is "+ ar.are(half,base,height));
        System.out.println("enter the length and breath");
        Double length =sc.nextDouble();
        Double breath =sc.nextDouble();
        System.out.println("the area of a rectrange is "+ar.are(length, breath));

    }
}
