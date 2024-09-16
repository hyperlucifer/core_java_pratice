package day27;

class circle{
    circle(int r){
        System.out.println("the area of circle is "+(3.14*r*r));
    }
}
class cilender extends circle{
    cilender(int r,int h){
        super(r);
        System.out.println("the area of cylinder is "+((2*3.14)*r*r)+(2*3.14)*r*h);
    }
}
public class superArea {
    public static void main(String[] args) {
        cilender c=new cilender(3,5);
    }
}
