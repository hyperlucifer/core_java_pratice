package day17;

class my_Thread_class1 implements Runnable{
    public void run(){
        while (true) {
            
            System.out.println("I am thread 1");
        }
    }
}
class my_Thread_class2 implements Runnable{
    public void run(){
        while (true) {
            
            System.out.println("I am thread 2");
        }
    }
}

public class runable_21 {
    public static void main(String[] args) {
        my_Thread_class1 t1=new my_Thread_class1();
        Thread g1=new Thread(t1);
        my_Thread_class2 t2=new my_Thread_class2();
        Thread g2=new Thread(t2);

        g1.start();//to run the thread use always use start method
        g2.start();
    }
}
