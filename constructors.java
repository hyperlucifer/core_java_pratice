package day7;
import java.util.Scanner; 
public class constructors {
    public int a;
    public int b;
    //constructors is special member funcation ,,which is used 
    //to initalise the data members(variables) of the class

    //A conctructor has a same name as a class 

    //A constructor dose'nt have any return type not even void

    //A constructors are automatically called as soon as object of its class is created

    //default constructors are those who has no arguments
    //eg

    constructors(){
        a=0;
        b=1;
    }

    // parameterized constructors are the constructors with arguments 

    //eg

   
    constructors(int x,int y){
        a=x;
        b=y;
    }
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
    //there is a also a concept called constructor overloading that is similar like method overloading
    public static void main(String[] args) {
        constructors c= new constructors(12,43);
        c.display();
        
    }
}
