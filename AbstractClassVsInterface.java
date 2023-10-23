import java.util.Date;

interface Employee {
    int salary();
}

abstract class Person {
    Date dateOfBirth;
    String firstName;
    String lastName;
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    abstract void walk();

    void fullName() {
        System.out.println(firstName +" "+ lastName);
    }
}

class Manager extends Person implements Employee {
    Manager() {
        super("Manager", "A");
    }
    @Override
    void walk() {
        System.out.println("Manager walking...");
    }

    @Override
    public int salary() {
        return 0;
    }
}

class SoftwareEngineer extends Person implements Employee {
    SoftwareEngineer() {
        super("Software Engineer", "B");
    }
    @Override
    void walk() {
        System.out.println("Software Engineer walking...");
    }

    @Override
    public int salary() {
        return 0;
    }
}

public class AbstractClassEx {
    public static void main(String[] args) {

    }
}
