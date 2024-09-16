package day9;

//inharitance is used to borrow propertes and methods from an existing class

//inharitance means diravering the propertises of one class to another
//we can access base class properties to deraive class 

class Base{
    int x;

    public int getx(){
        return x;
    }
    public void setx(int n){
        this.x=n;
    }
    public void printme(){
        System.out.println("dssf");
    }
}
//it inhairts a part of base class not all the properties it depands on access modifiers
//java doss't support multiple inharitance means two class cannot be base class for a derive class

//inharitance in java is declared using extends keyword
class deraive extends Base{ //he it tells that all the properites of base class can be also used in 
                                //diraive class
    int y;
    public void sety(int y){
        this.y=y;
    }
}
class er extends Base{

}

// we cannot access the elements of derive class from base class but 
//we can access the elements of base class from derive class 
public class inheritance {
    public static void main(String[] args) {
        //Creating a object of base class 
        Base b =new Base();
        b.setx(23);
        System.out.println(b.getx());
        //ceating a object of a base class 
        deraive d=new deraive();
        d.sety(23);
    }
}
/*
 * types of inharitance 
 * 
 * 1)single inharitance 
 * =one base class and one derived class =a->b
 * 
 * 2)muiti-level inhariance 
 * =there are more then 2 classes inharitaning each aother =a->b->c->d
 * 
 * 3)hierachial inhariance 
 * =one base class multiple derivied class
 */