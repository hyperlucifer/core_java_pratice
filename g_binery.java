package day46;

//maximum of minimum pages read by a student
public class g_binery {
    static int maxOf(int a[]){
        int max=0;
        for(int i=0;i<a.length-1;i++){
            max=Math.max(a[i],a[i+1]);
        }
        return max;
    }
    static int sumOf(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    } 
    static int minPages(int a[],int k){
        int min =maxOf(a);
        int max =sumOf(a);
        int res =0;
        while (min<=max) {
            int mid=(min+max)/2;
            if (isfeasible(a,k,mid)) {
                res=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return res;
    }
    static boolean isfeasible(int[] a, int k, int res) {
        int student=1,sum=0;
        for(int i=0;i<a.length;i++){
            if (sum+a[i]>res) {
                student++;
                sum=a[i];
            }
            else{
                sum+=a[i];
            }
        }
        return student<=k;
    }
    public static void main(String[] args) {
        int a[]={1,3,2,5,4,7};
      System.out.println(minPages(a, 2));
      
    }
}
