package day20;

public class Exception12 {

    /*
     * exception is an extend that occurs whan a program is excuted disturbing the normal flow of 
     * instruction
     * 1)checked Exception -->compile time exception(Handle by compiler)
     * 2)unchecked Exception->runtime exception
     * 
     * 
     * commonly occuring exception 
     * 
     * 1)null pointer exception
     * 2)Arithemetic exception
     * 3)Array index out of bound exception
     * 4)ilegal argument exception
     * 5)number format exception
     * 
     * to handle these exception we use try-catch block
     */
    public static void main(String[] args) {
        int a=60000;
        int b=0;
        try {                       //try block tells that try to excute this code 
            int c=a/b;                 //if any exception occurs while excuting this block catch
            System.out.println(c);                        //that in exception block and tells the reason why this code 
        } catch (Exception e) {     //can't be excute in the try block ,,we can also tell the 
                                    //reason or code to excute when the try block dos'nt work
            System.out.println("this cannot be done");
            System.out.println(e);//it will tell the type of exception
        }
        //it will continue to excute next lines of code
        System.out.println("end of the program");

        /*
         * without this block the code will crash and not excute the next lines after the 
         */
    }
}
