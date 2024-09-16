package day7;

import day1.paladromeNumber;

public class power {
    public int power(int x,int y){
        if (y==0){
            return 1;
        }
        else if (y==0) {
            return x;
        }
        else {
            return x*power(x, y-1);
        }
       
    }
    public static void main(String[] args) {
        power po =new power();
        int powe= po.power(3, 2);
        System.out.println(powe);
    }
}
