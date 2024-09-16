package day28;

import java.util.Scanner;

class Student {

    int roll_no;
    String name;
     static int c=0;
    Student (int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
        c++;
        System.out.println("the number of objects is "+c);
    }
   
}

public class stud {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll number of the student ");
        int no=sc.nextInt();
        System.out.println("enter the name of the student ");
        String name =sc.next();

        Student s=new Student(no,name);
        Student s1=new Student(no,name);
        Student s2=new Student(no,name);
    }
}
