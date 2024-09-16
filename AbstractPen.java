package day14;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("writing");
    }
    public void refill(){
        System.out.println("refilling");
    }
    public void changeNip(){
        System.out.println("changing nip");
    }
}
public class AbstractPen {
    public static void main(String[] args) {
       
    }
}
