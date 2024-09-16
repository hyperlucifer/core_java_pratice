package day36;

/*
 * when a funcation call it self it is called recursive funcation
 * 
 * recursive funcation can go in infinat loop to stop that we use a base case  
 * 
 * three steps of recursion 
 * i)find the base case
 * ii)find the relation between the problem and subproblems
 * iii)generalise the relation
 */

public class recursion {

    static void printHello(int n){
        if (n==0) {
            return;
        }
        System.out.println("awef");
        printHello(n-1);
    }
    //find the sum of n natural numbers
    static int sum(int n){
        if (n==1) {
            return 1;
        }
        return n+sum(n-1);
    }
    //find x^y 
    static int power(int x,int y){
        if (y==0) {
            return 1;
        }
        return x*(power(x, y-1));
    }
    //find the number of ways in n*m matrix
    static int ways(int m,int n){
        if(n==1||m==1){
            return 1;
        }
        return ways(m-1, n)+ways(m, n-1);
    }

    //josephus problem
    static int josephus(int n,int k){
        if (n==1) {
            return 0;
        }
        return (josephus(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
       // printHello(5);
        System.out.println(sum(5));
        System.out.println(power(3,4));
        System.out.println(ways(4, 3));
        System.out.println(josephus(5, 3));
    }
}
