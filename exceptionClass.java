package day21;

import java.util.Scanner;

/*
 * we can write our custom exceptions using Exception class in java
 */
class myException extends Exception{
    @Override
    public String toString(){
        return  "I am toString()";
    }
    @Override
    public String getMessage() {
        return "I am get massage";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        int a=8;

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a<99) {
            try{
            throw new myException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());//it will run the method after calling
                System.out.println(e.toString());
                System.out.println(e); // by default it will run tostring method
                e.printStackTrace();
            }
        }
    }
}
