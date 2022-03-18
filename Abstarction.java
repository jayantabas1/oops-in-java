import java.net.CacheRequest;

public class Abstarction {
    public static void main(String[] args) {
        // creating objects from abstarct classes.
        car c1 = new bmw();
        c1.start();

        tata t1 = new tata();
        t1.start();

    }

}

class bmw extends car {
    // have to override the abstract start method. since it has no definition
    @Override
    void start() {
        System.out.println("BMW is furious");

    }

}

class tata extends car {
    @Override
    void start() {
        System.out.println("tata is slow");

    }

}

abstract class car {
    int price;

    abstract void start();

}
