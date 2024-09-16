package day34;
/*
 * bit manipulation is the procress in we do operations on bits (binery)
 * it is faster then decimal numbers operations
 * 
 * in decimal has base of 10
 * eg
 *  2  7  4= 2*10^2 + 7*10^1 + 4*10^0;
 *  2  1  0
 * 
 * in binary has base of 2
 * eg
 *  this is how we convert the binary number into decimal
 * 
 *   (1  0  1)=1*2^2 + 0*2^1 + 1*2^0;
 *            = 4         0      1
 *            = 5
 *  this is how we convert the decimal number into binary
 * 
 *  for 14
 * 
 *  2|14|0
 *  2|7 |1
 *  2|3 |1
 *   |1 |
 * 
 * write all the remainder from opposite direction 
 * (1110) =14
 * 
 * second way 
 * 
 * first check if the number is even or odd
 * 
 * if the number is odd write
 * (1) and divide it by 2 and if the divided number is even write (0)
 * write it from right to left until the number becomes (1) or (0)
 * 
 * additon in binay
 * 1 1 1
 * --------  
 *  1 0 1
 * +1 1 1  
 * -------
 * 1 1 0 0
 * if the number goes over (2) carry over (1)
 * 
 * substraction 
 * 
 * we cannot directly substract the number like the decimal number
 * 
 * for subsraction we have to add the number with the nagtive inverce of the second number
 * eg 5+(-2)= 3
 * 
 * 1 1 0 0
 * - 1 0 1
 * 
 * =12+(-5)
 * =1100+(-101)
 * 
 * to find out the nagtive inverce of a binary number,the negitive number is binary is 2` complement
 * of that number
 *   
 * there are two steps for find out 2`complement
 * 
 * if the number is (101)
 * 1)invert all the bits
 *  101---->>010
 * 2)add one
 *  010 --->>011 this is -5
 * 
 *  because the of complementry the actule number becomes 111111010
 *  there are more (0)s in front of actule number and all those numbers become 1  
 * 
 * now add this number into first number
 * 
 *  111
 * --------
 *  0001100
 * +1111011
 * --------
 *  0000111
 * 
 * this is 7 in decimal
 * 
 * it works on two numbers
 * (&) AND operater 
 * 
 * 1)if the both bits are (1) ,,it will return (1) else (0);
 * 
 * (|) OR operator
 * 
 * 1)if one of the bit is (1) / both bits are 1,, it will return 1 else (0)
 * 
 * (^) XOR
 * 
 * 1)if both of the bits are different it will return (1) else (0);
 * 
 * (~) inverce opeator
 * 
 * works on single number
 * 
 * 1)it will inverce all the bits of the number eg== (~5) ->0000101 -->> 1111010
 * 
 * (>>) right shift operator
 * 
 * when ever you right shift the number by 1 it will divide that number by 2
 * 
 * 1)it will shift the bits towards the right by the number given in the front 
 *  eg = 12>>2
 *     = 1100>>2
 *     = 0011
 *     = 3
 * 
 * (<<) left shift operator
 * 
 *  when ever you left shift the number by 1 it will multiply that number by 2
 * 
 * 1)it will shift the bits towards the left by the given number
 * eg) = 12<<2
 *     = 1100<<2
 *     = 110000
 *     = 48
 * 
 */
public class BitManipulation {
    public static void main(String[] args) {
        //odd even 
        //every even numbers last bit if 0
        //every odd numbers last bit if 1
        int n =12;
        if ((n&1)==0){
            System.out.println("this number is even ");
        }
        else{
            System.out.println("this number is even ");
        }

        //swap two numbers
        int a=34;
        int b=45;

        a=a^b; 
        b=a^b;
        a=a^b;

        System.out.println("a= "+a+" b= "+b);

    }
}
