package day11;

class phone{
    public void greet(){
        System.out.println("Good morning");
    }
    public void name(){
        System.out.println("i am nokiya");
    }
}
class smartphone extends phone{
    public void sawagat(){
        System.out.println("aapka shwagat hai");
    }
    public void name(){
        System.out.println("my name is samsung ");
    }
}

public class dynamicMethodDispach {
    public static void main(String[] args) {
        //phone obj =new phone();
        phone obj=new smartphone();//it is only possiable only if the referance is of a 
                                    //superclass and the object is of the subclass

        obj.name();//if we run the overriden method it will run method of a referance not a object on
                   //this case it will run method that is written in side the smartphone not in the phone   
                
                   //it uses the run time polymorfisem because it will crearte a object at 
                   //run time the new keyword represent that

        //obj.shwagat(); we can only run the methods that is written in refrance class
        //               of the variable
        
        //in dynamic method dispach it will deside which method to run in runTime because 
        //it make object at run time
    }
}
