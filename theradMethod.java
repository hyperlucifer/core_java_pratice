package day17;

/*
 * in thread we write every method in "run()" method
 */

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i==1) {
                Thread.yield();
                System.out.println("from thread A = "+i);
            }
        }
        System.out.println("End of thread A ");
    }
}
class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i==3) {
                stop();
                System.out.println("from thread b = "+i);
            }
        }
        System.out.println("End od thread b ");
    }
}

public class theradMethod {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.start();
        b.start();
       

    }
}
