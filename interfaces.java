public class interfaces implements car {
    public static void main(String[] args) {

        interfaces i1 = new interfaces();
        i1.start();

    }

    @Override

    public void start() {
        System.out.println("car is running");
    }

}

interface car {
    void start();

}
