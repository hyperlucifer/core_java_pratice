package day7;

//in one java file there can be only one public class

class employee {
    int id;
    String name;
    
    public void printDetails(){
        System.out.println("employee id is "+id);
        System.out.println("Employee name is "+name);
    }
}
//comapering object with real world object 
//
//Real world object ----->properties + behavours
// object in oops   ----->attributes + methods
public class customClass {
    public static void main(String[] args) {
       employee e1=new employee();//Instantiating a new object

       // Setting properties/attributes
       e1.id=12;
       e1.name="sheth";
       e1.printDetails();
    }
}
