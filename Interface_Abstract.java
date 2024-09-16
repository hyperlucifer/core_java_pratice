package day13; 
interface Bicycle {
    int a=32;       //we can also define properties in interface
    void applyBreake(int decrement); //you cant modify the properties in interface
    void speedup(int increment); //because they are final
    
}
interface music{
    default void add(){                  //we can define the method with "default" Access modifier 
        System.out.println("i can add"); //use default keyword 
                                        // we cannot modify the interface because if we add another 
                                        //funcation in it we have to define that method in all 
                                        //the classes that are implementing that interface 
                                        //thats why default method is used 
                                        //we can over write it in a specific class
    }
    static void we(){
        System.out.println("i am static method"); //we can also define static method in interface
    }                                             // but in abstract we can define method directly
                                                //we can call static method by using interface name
    void gautami_patil();
    void patil();
}
//the main difference in interface and Abstract class is 
//we can implement multiple interface in a single class at a time(like multiple inharitance)
//but in abstract class we can extent only one abstract class at a time
class herocycle implements Bicycle,music{
    public void applyBreake(int decrement){//while implementing the method we should make it 
                                        //public
        System.out.println("brake has been applied");
    }
    public void speedup(int increment){
        System.out.println("the speed has been incleased");
    }
    public void gautami_patil(){
        System.out.println("kach kach kanda");
    }
    public void patil(){
        System.out.println("patlan cha bailgada");
    }
    public static void we() {

    }
}
public class Interface_Abstract {
    public static void main(String[] args) {
        herocycle he=new herocycle();
        he.gautami_patil();
        he.add();
     music.we();  //calling static method
    }
}
