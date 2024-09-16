package day8;

import java.util.Scanner;

class player{
    int p_id;
    String p_name;
    int p_totalruns;
    int p_Inningplayed;
    int p_NotOutTimes;
    int avg;

    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id of the player");
        p_id=sc.nextInt();
        System.out.println("enter the name of the player");
        p_name=sc.next();
        System.out.println("enter the totalRun of the player");
        p_totalruns=sc.nextInt();
        System.out.println("enter the inningPlayed of the player");
        p_Inningplayed=sc.nextInt();
        System.out.println("enter the notOutTimes of the player");
        p_NotOutTimes=sc.nextInt();
        avg=p_totalruns/p_Inningplayed;
    }

   
    public void display(){
        System.out.println("the id of the player is "+p_id);
        System.out.println("the name of the player is "+p_name);
        System.out.println("the totalRun of the player is "+p_totalruns);
        System.out.println("the inningPlayed of the player is "+p_Inningplayed);
        System.out.println("the notOutTimes of the player is "+p_NotOutTimes);
    }
}

public class cricket {
    public static void main(String[] args) {
        player[] p=new player[5];
        for(int i=0;i<p.length;i++){
            p[i]=new player();
            p[i].accept();
        }
        int maxavg=0;
        for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
                if (p[i].avg>p[j].avg) {
                    maxavg=p[i].avg;
                }
                
            }
        }
        System.out.println(maxavg);
        for(int i=0;i<p.length;i++){
            if (maxavg==p[i].avg) {
                p[i].display();
            }
        }
    }
}
