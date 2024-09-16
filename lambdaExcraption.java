package day26;
@FunctionalInterface
interface Demoano {
    void meth();

   // void meth2();
}

// class anoyDemo implements Demoano {

//     public void display() {
//         System.out.println("hello");
//     }

//     public void meth() {
//         System.out.println("iam meth1");
//     }

//     public void meth2() {
//         System.out.println("iam meth1");

//     }
// }

public class lambdaExcraption {

    public static void main(String[] args) {

        //Anonymous classes enable you to make your code more concise.
        //They enable you to declare and instantiate a class at the same time.
        //They are like local classes except that they do not have a name. 
        //Use them if you need to use a local class only once.



        Demoano obj=new Demoano(){
            public void meth(){                 //when we want to make a object single time 
                System.out.println("iam meth1");//and use there method without making a real class
            }                                  //we use anominus class
            public void meth2(){
                System.out.println("i am meth2");
            }
        };
        obj.meth();
        
        //lambda expreation is used to make a class which implement a interface 
        //with only one method
        
        Demoano obj1=()->{
          System.out.println("i am meth1");  
        };
        obj1.meth();
    }
}
