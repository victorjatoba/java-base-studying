package class_vs_interface;

import java.util.Date;

interface Employee {
    int salary();
}

abstract class Person {
    Date dateOfBirth;
    String firstName;
    String lastName;

    Person(String firstName,
           String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void walk();

    String fullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return this.fullName();
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
        Person p = new Person("First name Abs", "Last name Abs") {
            @Override
            void walk() {

            }
        };

        System.out.println(p);
    }
}
