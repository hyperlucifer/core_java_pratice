package day35;

/*
 *gcd=greatest common diviser
 * GCD(a,b)=gcd(a-b,b)
 * a>b
 */


public class GCD {
    static int gcd (int a,int b){
        if(b==0)
            return a;
        
        
            return gcd(b,a%b);
        
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 27));
    }
}
