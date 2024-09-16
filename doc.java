package day27;

import java.util.Scanner;

class doctor {
    int dno;
    String dname;
    String qualications;
    String specialation;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the doctor");
        dno = sc.nextInt();
        System.out.println("enter the name of the doctor ");
        dname = sc.next();
        System.out.println("enter the qualications of the doctor ");
        qualications = sc.next();
        System.out.println("enter the specialation of the doctor ");
        specialation = sc.next();
    }

    void display(){
        System.out.println("the number of the doctor is "+dno);
        System.out.println("the name of the doctor is "+dname);
        System.out.println("the qualications of the doctor is "+qualications);
        System.out.println("the specialation of the doctor is "+specialation);
    }
}

public class doc {
    public static void main(String[] args) {
        doctor[] d=new doctor[32];
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the doctor number ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            d[i]=new doctor();
           d[i].accept();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((d[i].dname).compareTo(d[j].dname)>0){
                    String str=d[i].dname;
                    d[j].dname=d[i].dname;
                    d[i].dname=str;
                }
            }
        }
        for(int i=0;i<n;i++){
           d[i].display();
        }
    }
}
