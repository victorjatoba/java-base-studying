package stream_api;

import java.util.List;

/**
 * Imagine that you have Person class with attributes name and age. Givem a list of Person, how would you use the Java Stream API
 * to create a list of Animal for each person.
 */
public class PersonDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Jorge", 25),
            new Person("Karina", 30)
        );

        List<Animal> animal = people.stream()
            .map(p -> new Animal(p.name() + "' Pet", p.age()))
            .toList();

        people.forEach(System.out::println);
        animal.forEach(System.out::println);
    }

    record Person(String name, int age) {}
    record Animal(String name, int age) {}
}
