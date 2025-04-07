package jvm.runtime_data_area;

import java.util.List;

public class Demo {

    void main() {

        record Person(String name) {
            @Override
            public String toString() {
                return name();
            }
        }

        Person p1 = new Person("Rochelle");
        Person p2 = new Person("Bella");
        Person p3 = new Person("Miguel");
        Person p4 = new Person("Thales");

        List<Person> family = List.of(p1, p2, p3, p4);

        System.out.println(p1);
    }
}

