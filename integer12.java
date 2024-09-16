package day28;

import java.util.Scanner;

interface integer{
    boolean check(int num);
}
class pos implements integer {
    public boolean check(int num){
        if (num>0) {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class integer12 {
    static int accept(){
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        return num;
    }
    public static void main(String[] args) {
        int num=accept();
    }
}
