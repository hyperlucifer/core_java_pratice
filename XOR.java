package day35;

/*
 * properties of XOR
 * 
 * 1)when the bits are different it returns (1) else (0)
 * 
 * 2)when two numbers are same its xor is always zero
 * 
 * 3)0^n is always n
 */

public class XOR {
    public static void main(String[] args) {
        //find the only non-repeating element in a array when every element repeats twice

        int []a={5,4,1,4,3,5,1};

        int res=0;

        for(int i=0;i<7;i++){
            res=res^a[i];      //this will turn the repeated element to zero
        }                      //this will be in constant space and time
        System.out.println(res);
    }
    //find non reapeating elements where all elemens repeats thrice

}
