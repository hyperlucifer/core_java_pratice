package day3;
/*
method is same as function,it impleate the DRY(don't repeate yourself) principle 
a method is a funcation that is present inside the class 

it copys the value as in method paramerter dose'nt take the actule value 
*/
public class method {

    static int sum(int a,int b){//static means we can call this method without using the object.
        int c=a+b;              //static method is associate with the class,not the object of the class            
        return c;               //,means it is common method of all any mothed inside that class can use this method
    }
    int multi(int a,int b){//non static means every object of this class has its own copy of this 
        int c=a*b;         //logic
        return c;
    }
    public static void main(String[] args) {
        /*
         * A method can be called by creating an object of the class in which the method exists 
         */

        int a =3;
        int b =5;
        int d =sum(a,b);//calling a static method
        System.out.println(d);
        //calling non static method by creating object
        method mul=new method();
        int e=mul.multi(a,b);
        System.out.println(e);
    }
}
