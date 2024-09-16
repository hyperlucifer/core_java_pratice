package day13;

// java dose'nt support multiple inheritance 

/*
 * because multiple inhertance face proble when their exists method
 * with same signature in both superclasses
 * 
 * we can achive same thing using interface ,,it is better way to do that
 */

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

public class multipleInhari {
    public static void main(String[] args) {
        smartphone sp = new smartphone();
    }
}
