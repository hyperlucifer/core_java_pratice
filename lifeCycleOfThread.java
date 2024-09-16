package day18;


class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        int i=32;
        //System.out.println("tfwef");
       
    }
}

public class lifeCycleOfThread {

    /*
     * there are 5 stages of lifecycle
     * 
     * 1)new-->thread is created but not yet started by invoking start()
     * 
     * 2)Runable->after invocation of start()& befour selected to be run by
     *            the schelder
     * 
     * 3)Running->after the schelder has selected it 
     * 
     * 4)Not-Runable->thread is alive but not eligible to run
     * 
     * 5)Terminated-> the run() has been exited
     * 
     */

    public static void main(String[] args) {
        myThr t=new myThr("sheth");
        t.start();
        System.out.println(t.getId()); //it will give the id of this thred
        System.out.println(t.getName());
    }
}
