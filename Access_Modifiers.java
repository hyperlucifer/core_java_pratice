package day9;

class  myemployee{
    private int id; //use private keyworld to make it private
    private String name;
    //we cannot directly acccess the private data members outside the class
    //these are only access able oniy to that class 
    //we can access them using methods 

    //it implements the data hiding 

    //it is used because we dont want any one to change our values

    //making methods to access these values

    public void setname(String n){
        name = n;
    }
    public void setid(int n){
        id=n;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class Access_Modifiers {
    public static void main(String[] args) {
        myemployee e=new myemployee();
        e.setid(32);
        e.setname("Sheth");
        int id=e.getid();
        System.out.println(id);
        String name= e.getname();
        System.out.println(name);
       
    }
}
