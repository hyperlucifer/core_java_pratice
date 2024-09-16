package day34;

/*
 * bit Masking ==is the process of changing the number by doing (AND ,OR ,NOT ) operations 
 */

public class bitMasking {
    public static void main(String[] args) {
        //finding i^th bit 
        int a=23;
        int i=3;
        int b=a<<i;
        int and=a&1;//mask
        if(and==1){
            System.out.println("the number is 1");
        }
        else{
            System.out.println("the number is 0");
        }
        //seting i^th bit 
        int n=34;
        int j=3;
        int m=n<<j; 
            n=n|m; //seting 0 to 1

        int k=32;
        int l=3;
        int com=~(1<<l);
        int result=n&com;

        //find the number of bits to change to convert num1 to num2
        int x=35;
        int y=87;
        int z=x^y;

        int count =0;
        while (z!=0) {
            count++;
           z= z&(z-1);//this will convert all the (1) bits to zero one by one
        }
        System.out.println(count);
    }
}
