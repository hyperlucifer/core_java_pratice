package day7;


class copy 
{
    int id =4;
    String name="copy";

    public void print1(){
        System.out.println("the id is "+ id);
        System.out.println("the name is "+ name);
    }
    
}
public class copyData {
    public static void main(String[] args) {
    copy ori =new copy();
    ori.print1();
    copy o =new copy();
    o=ori;
    o.print1();
    }
}
