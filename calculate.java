package day29;


abstract class Shape{
    abstract double calcaArea(int r,int l);
    abstract double calcaVolume(int r,int h);
}
class speare extends Shape{
    double calcaArea(int r,int l){
        return (4*3.14)*r*r;
    }
    double calcaVolume(int r,int h){
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}

class cone extends speare{
    @Override
    double calcaArea(int r,int l){
        return Math.PI*r*(r+l);
    }
    @Override
    double calcaVolume(int r ,int h){
        return (1.0/3.0)*Math.PI*Math.pow(r, 2)*h;
    }
}
public class calculate {
    public static void main(String[] args) {
        speare sp =new speare();
        cone co =new cone();
    }
}
