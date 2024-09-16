package day29;

import java.util.Scanner;

class employee {
    private int id;
    private String name;
    private String department;
    private int Salary;
    int max_sal;
    employee(int id,String name,String department,int Salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.Salary=Salary;
       
    }
     void display(){
        System.out.println("the id of the employee is "+id);
        System.out.println("the name of the employee is "+name);
        System.out.println("the department of the employee is "+department);
        System.out.println("the salary of the employee is "+Salary);
    }
}

class Manager extends employee
{
    private int bonce;
    Manager(int id, String name, String department, int Salary,int bonce) {
        super(id, name, department, Salary);
        this.bonce=bonce;
        this.max_sal=Salary+bonce;
    }
}
public class emp {
    public static void main(String[] args) {

        int total=0;

        Manager[] ma =new Manager[2];

        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<ma.length;i++){

            System.out.println("enter the employee id ");
            int id=sc.nextInt();
            System.out.println("enter the employee name ");
            String name=sc.next();
            System.out.println("enter the employee department ");
            String department=sc.next();
            System.out.println("enter the employee salary ");
            int salary=sc.nextInt();
            System.out.println("enter the employee bonuce ");
            int bonce=sc.nextInt();
            ma[i]=new Manager(id,name, department, salary,bonce);
           
        }

        for(int i=0;i<ma.length;i++){
            for(int j=i+1;j<ma.length;j++){
                if(ma[i].max_sal<ma[j].max_sal){
                    total=ma[j].max_sal;
                }
            }
        }
        for(int i=0;i<ma.length;i++){
            if(ma[i].max_sal==total){
                ma[i].display();
            }
        }
    }
}
