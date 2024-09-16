package day8;
import java.util.Scanner;
class person {

    int p_id;
    String p_name;
    int p_age;
    String p_gender;

    person(int id,String name,int age,String gender){
        this.p_id=id;
        this.p_name=name;
        this.p_age=age;
        this.p_gender=gender;
    }
    void display(){
        System.out.println("the person id "+p_id);
        System.out.println("the person name "+p_name);
        System.out.println("the person age "+p_age);
        System.out.println("the person gender "+p_gender);
    }
}

public class con_overloading {
    public static void main(String[] args) {
        person[] p=new person[5];
        for(int i=0;i<p.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the person id");
            int id=sc.nextInt();
            System.out.println("enter the person name");
            String name=sc.next();
            System.out.println("enter the person age");
            int age=sc.nextInt();
            System.out.println("enter the person gender");
            String gender=sc.next();
            p[i]=new person(id, name, age, gender);
        }
        for(int i=0;i<5;i++){
            p[i].display();
        }
    }
}
