package day21;

class myException1 extends Exception{
    public String toString(){
        return "radius cannot be negitive ";
    }
}

/*
 * throws keyword tells that this program can throw an exception befour 
 * excuting the method and you should handle it by using try catch block
 * 
 * 
 * throw means we can intenshnally give a exception a when a certain case appiers
 * 
 * throws means it gives a masseage that this program can throw an errror and you should handel it
 */
public class throwVsThows {
    public static int divide(int a,int b)throws ArithmeticException{
        return a/b;
    }
    public static double area(int r)throws myException1{   //we cannot run these methods out of 
        if (r<0) {                                         //try-catch block
            throw new myException1();
        }
       
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
      try {
         int c= divide(6, 0);
       System.out.println(c);
      } catch (Exception e) {
        System.out.println("exception");
      }
    }
}
