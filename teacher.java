package day27;

import java.util.Scanner;

class teacher1{
    int Tid;
    String Tname;
    String Designation;
    int salary;
    String subject;

    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the teacher id ");
        Tid=sc.nextInt();
        System.out.println("Enter the teacher name ");
        Tname=sc.next();
        System.out.println("Enter the teacher Designation ");
        Designation=sc.next();
        System.out.println("Enter the teacher Salary ");
        salary=sc.nextInt();
        System.out.println("Enter the teacher Subject ");
        subject=sc.next();
    }
    void display(){
        System.out.println("the teacher id is "+Tid);
        System.out.println("the teacher name is "+Tname);
        System.out.println("the teacher Designation is "+Designation);
        System.out.println("the teacher Salary is "+salary);
        System.out.println("the teacher Subject is "+subject);
    }
}

public class teacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="java";
        teacher1[] t=new teacher1[35];
        System.out.println("enter the nunber of the teacher ");
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            t[i]=new teacher1();
            t[i].accept();
            System.out.println();
        }
        for(int i=0;i<n;i++){
            System.out.println();
            if((t[i].subject).equals(s1)) {
                t[i].display();
           }
        }
    }
}
