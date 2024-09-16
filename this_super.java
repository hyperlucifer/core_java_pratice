package day10;

//this is a referal keyword when the name of the variable is sane inside the method 
//this is used
//it is also used to pass a object of a specific class

//this is a way to referance an object of a class which is being created
class we {
    int a;

    we(int a) {
        this.a = a;
    }

    public int geta() {
        return a;
    }

    public int one() {
        return 1;
    }
}

/*
 * a super a variable which is used to refer immidate paraent class object
 * it could used to invoke paraent class method/constructors
 */
class todo extends we {
    int s;

    todo(int a) {
        super(a);
        System.out.println("todo");

    }

}

public class this_super {
    public static void main(String[] args) {
        todo w = new todo(4);
        System.out.println(w.geta());
    }
}
