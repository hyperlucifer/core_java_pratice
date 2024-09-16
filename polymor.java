package day14;
interface camera {
    void takesnap();

    void recordvideo();
}

interface wifi {
    String[] getnetwork();

    void connectToNetwork(String network);
}

class MycellPhone {
    void call() {
        System.out.println("phone number");
    }

    void pickcall() {
        System.out.println("callpicked");
    }
}

/*
 * here this line tells this smartphone is a cellphone that can act like camera
 * and wifi
 * this polymorphism
 * 
 */
class smartphone extends MycellPhone implements wifi, camera {
    public void takesnap() {
        System.out.println("taking snap");
    }

    public void recordvideo() {
        System.out.println("recording video");
    }

    public String[] getnetwork() {
        System.out.println("geting list of all the network ");
        String[] network = { "sheth", "mothi mansa", "lay mothi mansa" };
        return network;
    }

    public void connectToNetwork(String network) {
        System.out.println("connected");
    }
}

public class polymor {
    /*
     * polymprphisam in interface tells
     * here this line tells this smartphone is a cellphone that can act like camera
     * and wifi 
     * 
     * if we make cellphone class and extends it to smartphone and implements
     * camera and wifi interface
     */
      public static void main(String[] args) {
        wifi wi = new smartphone();//if the referance is of wifi and the object is of smartphone 
                                    //it means we can only access the methods return in wifi
    }
}
