package day14;


class mon{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
interface basicAnimal {

    void eat();
    void sleep();
    
}
class human extends mon implements basicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}
public class monkey {
    public static void main(String[] args) {
        mon hu =new human();//this is the way to demonstrate polymorpisam 
        hu.bite();          //this line tells it is a object of a human class but you can
                            // use only the methods written in mon class
    }
}
