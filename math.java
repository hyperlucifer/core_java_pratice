package day35;

public class math {
    public static void main(String[] args) {
        int n=30;
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        //trailing zeros in factorial
        int res=0;
        for (int i=5;i<=n;i*=5){
            res=res+(n/i);
        }
        System.out.println(res);
    }
}
