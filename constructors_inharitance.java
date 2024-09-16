package day10;

class Base{

    Base(){
        System.out.println("i am a constructor");
    }
    Base(int a){
        System.out.println("i am a overloaded constructor with the value a as "+a);
    }
}
/*
 * if we make constructor of base class and derive class 
 * and make object of the derive class then it will run both the constructors
 * 
 * 1st the base class and then the derive class constructor will be excuted
 */
class derive extends Base{
    derive(){
        //for calling a overloaded constructor of base class in the derived class
        //we use the super keyword to pass the arguments by default it will run the
        //constructor with no arguments
        // super(3);
        System.out.println("i am a derive class constructor");
    }
    derive(int a ,int b){
        super(a);
        System.out.println("i am a derive class constructor with he value "+b);
    }
} 
class childofderive extends derive{
    childofderive(){
        System.out.println("i am a child of derive class ");
    }
    childofderive(int x,int y,int z){
        super(x,y);
        System.out.println("i am a child of derive class with the value "+z);
    }
}
public class constructors_inharitance {
    public static void main(String[] args) {
        //Base b =new Base();
        // derive d = new derive(3,4);
        childofderive cd=new childofderive(12,3,4);
    }
}
