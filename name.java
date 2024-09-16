package day8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class employee{
    String name;
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
public class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of employees ");
        int n=sc.nextInt();

        employee[] e=new employee[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter the name of the employee "+(i+1));
            String name=sc.next();
            e[i]=new employee();
            e[i].setname(name);
        }
        Arrays.sort(e, Comparator.comparing(employee::getname));

        for(int i=0;i<n;i++){
            System.out.println(e[i].getname());
        }
    }
}
