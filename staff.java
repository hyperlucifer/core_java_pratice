package day52;

import java.util.Scanner;

abstract class staff1 {
    public String name;
    public String address;

    abstract void getname();

    abstract void getaddress();
}

class fullTimeStaff extends staff1 {
    String department;
    int salary;

    fullTimeStaff(String dep, int sal) {
        department = dep;
        salary = sal;
    }

    Scanner sc = new Scanner(System.in);

    void getname() {
        System.out.println("enter the name");
        name = sc.next();
    }

    void getaddress() {
        System.out.println("enter the name");
        address = sc.next();
    }
    void display(){
        System.out.println("the name of the employee is "+name);
        System.out.println("the address of the employee is "+address);
        System.out.println("the department of the employee is "+department);
        System.out.println("the salary of the employee is "+salary);
    }
}

class partTimeStaff extends staff1 {
    int numberOfHours;
    int rate;

    partTimeStaff(int num, int rate) {
        numberOfHours = num;
        this.rate = rate;
    }

    Scanner sc = new Scanner(System.in);

    void getname() {
        System.out.println("enter the name");
        name = sc.next();
    }

    void getaddress() {
        System.out.println("enter the address");
        address = sc.next();
    }
    void display(){
        System.out.println("the name of the employee is "+name);
        System.out.println("the address of the employee is "+address);
        System.out.println("the number of hours of the employee is "+numberOfHours);
        System.out.println("the rate of the employee is "+rate);
    }
}

public class staff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice ");
        int choise=sc.nextInt();
        int n=0;
        if (choise==1) {
            System.out.println("enter the number of employees ");
            n=sc.nextInt();
            fullTimeStaff f[]=new fullTimeStaff[n];
            for(int i=0;i<n;i++){
                String dep;
                int salary;
                System.out.println("enter the department ");
                dep=sc.next();
                System.out.println("enter the salary ");
                salary=sc.nextInt();
                f[i]=new fullTimeStaff(dep, salary);
                f[i].getname();
                f[i].getaddress();
                f[i].display();
            }
        }
        else if (choise==2) {
            System.out.println("enter the number of employees ");
            n=sc.nextInt();
            partTimeStaff f[]=new partTimeStaff[n];
             for(int i=0;i<n;i++){
                int num;
                int rate;
                System.out.println("enter the number of hours ");
                num=sc.nextInt();
                System.out.println("enter the rate ");
                rate=sc.nextInt();
                f[i]=new partTimeStaff(num, rate);
                f[i].getname();
                f[i].getaddress();
                f[i].display();
            }
        }
    }
}
