package day4;

public class Variable_Arguments {
// var args means we can give a funcation more than one arguments
//it takes all the arguments that are passed to the method and put it 
//into the array and than pass it 
//it means it can take as many arguments as you want

static int sum(int a,int ...arr){//this triple dot tell's take all the arguments 
                           //pack it into a array and pass it to me ,,it will behave like  "int[] arr"
    int result=0;           //here "a" is a compalsary argument ,the array can be empty but ,"a" cannot be empty 
    for(int i=0;i<arr.length;i++){
        result+=arr[i];
    }
    return result;                   
}
   public static void main(String[] args) {
        int a=sum(12,34,21,41,3);
        System.out.println(a);
   }
}
