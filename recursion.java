package day4;

// a function that call itself is called recursion;
// every recursive function needs a base case or a coundation to stop a funcation or
//it will go in infinite state 
//solution of recursive function can be also solve with itretive (loop) funcation
public class recursion {

    static int facto(int n){
        if (n==0||n==1) {
            return 1;           //here it will call it self until the base case occar
        }                       
        else{
            return n*facto(n-1);  //it will return the value and call the funcation with the new value                                  
        }                         //that is been return
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(facto(x));
    }
}
