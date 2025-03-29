/**
 * Imagine that you have Person class with attributes name and age. Givem a list of Person, how would you use the Java Stream API to cerate a new list where each person's name is updated to "NewName" while keeping their age unchanged?
 */

import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Jorge", 25),
            new Person("Karina", 30)
        );

        List<Person> updatedPeople = people.stream()
            .map(person -> new Person("Prof. " + person.name(), person.age()))
            .collect(Collectors.toList());

        updatedPeople.forEach(System.out::println);
    }

    record Person(String name, int age) {}
}
