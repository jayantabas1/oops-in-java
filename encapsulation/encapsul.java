package encapsulation;

public class encapsul {
    public static void main(String[] args) {

        encapsul e5 = new encapsul();
        e5.run();

    }

    // method in the encapsulation. since it is a default so other programs can not
    // access it.
    // it can be accessed by all the programs inside same packages.
    void do_work() {
        System.out.println("he is working");
    }

    // it can be accessed from anywhere i.e inside or outside of packages. beacuse
    // of public access specifier.
    public void go() {
        System.out.println("he is going");
    }

    // private methods can be accessed only inside the same class.
    private void run() {
        System.out.println(" he is running");
    }

}
