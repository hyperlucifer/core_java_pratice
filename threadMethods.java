package day18;

class myThr2 extends Thread{
   
    public void run(){
        while (true) {
           System.out.println("ert");
       }
    }
}
class myThr3 extends Thread{
   
    public void run(){
        while (true) {
           System.out.println("hjmn");
           try {
            Thread.sleep(455);
           } catch (Exception e) {
            e.printStackTrace();
           }
       }
    }
}
public class threadMethods {
    public static void main(String[] args) {
        myThr2 t2=new myThr2();
        myThr3 t3=new myThr3();
        t2.start();
        // try {
        //      t2.join();        //this method tells first excute the t2 fully and than procite to next 
        // } catch (Exception e) {//thread to excute
        //     System.out.println(e);
        // }
       
        t3.start();
    }
}
