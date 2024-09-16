package day3;

public class methodOverloading {
    //as we know that the we pass the copy to the method as argument
    //means i cannot change the actule value
    static void change(int x){
        x=98;
    }
    //but in case of objects or arrays it passes the refernce (the address of the object/array)
    //not a copy of objects or arrays 
    //means it can change actule value 
    static void change2(int [] arr){ //the values we get in the function is called parameters
        arr[0]=98;                   //the values we pass/give the function from main is called arguments
    }
    //method overloading means two or more method can have same name but different parameters
    static void greet(){
        System.out.println("good morning");
    }
    static void greet(String s){
        System.out.println("good morning "+s);
    }
    //overloading by changing return datatype is not posiable
    public static void main(String[] args) {
        //the value will not change
        int x=54;
        change(x);
        System.out.println("the value after change "+x);
        //the value will change
        //the marks is a memory refernce to the array object ,,or telling where the object is store
        int [] marks={12,33,42,34,24,35,3};
        change2(marks);
        System.out.println("the value after change "+marks[0]);

        //overloading
        //in this it will calculate the arguments a according to that it will call the funcation
        greet();
        greet("sheth");
    }
}
