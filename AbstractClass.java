package day12;

//a method that is declare without any impleation

//it means we make a method without telling what this method will do 

//if a class includes abstract methods ,,than the class itself must be declare abstract ,,
//even if one abstract method

//a abstract is a class which helps us to make outher class
//it sets a standard for the outher classes
//the abstract method must be overriden in every extented class

//we cannot make a object of the abstract class,,,it is not a class it is a standrad that helps to 
//make outher classes

//we can make another abstract class extending the another abstract class
abstract class Base{
    public Base(){
        System.out.println("iam a base class contructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract void greet();
}
//abstract class tells inharite me and make more classes out of me
//we can do that by inheriating and overriding the methods

//we cannot extent the base class without overriding the abstract method
class derive extends Base{
    public void greet(){
        System.out.println("good morning");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        derive d=new derive();

        Base b=new derive();//it is possible to create referance of the abstract class and the object of a 
                            //concrate subclass
                            //but it is not possiable to create a object of an abstract class

        d.greet();
    }
}
