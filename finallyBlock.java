package day22;

/*
 * finally block contains the code which is always excuted where the exception is handel 
 * or not ,,it is used to excute code containing instractions to release the system 
 * resources,close a connection
 */
public class finallyBlock {
    public static int greet(){
        int c;
        try {
            int a = 23;
            int b = 2;
             c=a/b;
            return c; // this code will not return from here because it have to excute the 
                        //finally block
        } catch (Exception e) {
            System.out.println(e);
        } 
         finally {
            System.out.println("wef");
        }
        return 0;//in case it dose'nt go inside the try
    }
    public static void main(String[] args) {
       int k=greet();
       System.out.println(k);

        int a=7;
        int b=9;

        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("i am finally");
            }
            b--;
        }
    }
}
