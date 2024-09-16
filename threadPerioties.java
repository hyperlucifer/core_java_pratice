package day18;

class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }
    public void run(){
        while (true) {
           System.out.println(this.getName());
       }
    }
}

public class threadPerioties {
    public static void main(String[] args) {
        myThr1 t1 =new myThr1("sheth1");
        myThr1 t2 =new myThr1("sheth2");
        myThr1 t3 =new myThr1("sheth3");
        myThr1 t4 =new myThr1("sheth4");
        myThr1 t5 =new myThr1("sheth5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
