package day11;
//method overriding tells inharite all the methods of the base class but implament 
//a specific method of your own class

/*
 * If a child class implements the same method present in the paraent class again ,,
 * it is known as method overriding 
 * 
 * redefining the method of super class (in the subclass) 
 * 
 * the list of arguments must be same
 * 
 * data type must be same
 * 
 * the access level should not be restrictive of the method (should be public)
 * 
 * we can't override static/final method
 */
class A{
    public int a;
    public int four(){
        return 4;
    } 
    public void met2(){
        System.out.println("i am method 2 of class a");
    }
}
//here if we make an object of class b and call 'met2' method then it will call 
//the met2 that is inside the class b  but 
//
//if we made the object of class a and call 'met2' method then it will call 
//the met2 that is inside the class a

//for this name of the both method should be same
class B extends A{
    @Override            //it is a notitation that tells this method is override
                        //this notitation should be given only if the method is over riden 
                        //else it will show the error
    public void met2(){
        System.out.println("i am method 2 of class b");
    }

    public void meth3(){
        System.out.println("i am method 3 of class b");
    }
}
public class methodOverrideing {
    public static void main(String[] args) {
        A a=new A();
        a.met2();
        B b=new B();
        b.met2();
    }
}
