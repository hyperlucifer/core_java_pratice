package day19;

import java.util.Scanner;

/*
 * there are three types of errors 
 * 1)syntax  error
 * when a compiler find something wrong with the program it throws syntax error
 * 2)logical error
 * a logical error or a bug accurs when a program compiles and runs but do the 
 * wrong thing  
 * 3)runtime error(Also called exceptions)
 * java may sometime enconter an error while the program is running this is called exception
 * this is encountered due to circumstances like bad input or resource constraints  
 *
 */
public class error_expection {
    public static void main(String[] args) {
        //runtime error

        int k;
        Scanner sc =new Scanner(System.in);
        k=sc.nextInt();
        System.out.println(1000/k);
    }
}
