package encapsulation;

public class encapsul2 {
    public static void main(String[] args) {

        // encapsul e4 = new encapsul();

        // // it cant access the method run because it is private
        // // e4.run();
        // // but this method can be accessed by the same packages.
        // e4.do_work();

        laptop l1 = new laptop();
        // here the price can be changed by anyone since it is not a private.
        l1.price = 1000;
        // but it can not be accessed because the name is private. to change it we will
        // use getter and setter.
        // l1.name = "asus";

        // to change the name , we have to access it with the method.
        l1.set_name("asus");

    }
}

class laptop {
    int ram;
    int price;
    private String name;

    public void set_name(String name) {
        boolean is_admin = false;
        if (!is_admin) {
            System.out.println("can not change name");

        } else
            this.name = name;
    }
}
