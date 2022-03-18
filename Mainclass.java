import encapsulation.encapsul;

public class Mainclass {
    public static void main(String[] args) {

        // creating objects of Person class using new keyword
        Person p1 = new Person();
        p1.name = "jayanta";
        p1.age = 24;
        System.out.println("Name is:" + p1.name + " and age is: " + p1.age);
        // here the p1 is the object and the name and the age is the properties.

        // here the Person constructor is directing to the person with arguments, hence
        // there will be no
        // no increasing in static int count.
        Person p2 = new Person("david", 32);
        System.out.println("Name is:" + p2.name + " and age is: " + p2.age);

        // accessing the behaviour of the class person.
        p1.eat();
        // here the compile time polymorphism is happening. the both below methods are
        // same but one is not taking arguments.
        // p1.walk();
        p1.walk(4);
        // upcasting.
        // Person p3 = new Developer("naruto", 18);

        Developer d1 = new Developer("tanjiro", 16);
        System.out.println("developer is " + d1.name + "age is " + d1.age);
        d1.eat();
        d1.walk(6);
        d1.walk();

        //----------------------------------------
        // encapsulation

        encapsul e1 = new encapsul();
        // can not be accessed. the method is not visible
        // e1.do_work();

        // but this method is visible.
        e1.go();
        //-------------------------------------------

    }

}

// inheritance. here the child class is inheriting the properties of class
// person using super keyword.
// they need the same aruguments as constructor person.
class Developer extends Person {
    public Developer(String name, int age) {
        super(name, age);
    }

    // this walk method belongs to the child class developer.
    // here the runtime polymorphism is happening. because it doesnot know which
    // method to look at compile time.
    void walk() {
        System.out.println(name + " developer is walking");
    }
}

class Person {
    String name;
    int age;
    // static means the count integer is now a property odf class not of a object.
    static int count = 0;

    // creation of constructors.
    public Person() {
        count++;
        System.out.println("object is created");
        System.out.println(count);
    }

    // constructor overloading. It is taking arguments.
    // public Person(String newname, int newage) {
    // // here the this keyword is used to call another constructor.
    // // after executing another constructor the below statements of this() will
    // // execute.
    // this();
    // name = newname;
    // age = newage;

    // }
    // -------------------------------------------------------------------------
    public Person(String name, int age) {
        // here the this keyword is used to call another constructor.
        // after executing another constructor the below statements of this() will
        // execute.
        this();
        // this keyord can also be used to access the parameters of the same class.
        this.name = name;
        this.age = age;
    }
    // --------------------------------------------------------------------------

    // behaviour of the class
    void walk() {
        System.out.println(name + "is walking");

    }

    // method with arguments
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}
