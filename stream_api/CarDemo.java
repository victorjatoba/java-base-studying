package stream_api;

import java.util.Arrays;
import java.util.List;
public class CarDemo {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("BMW", "Honda", "Honda", "Honda", "Honda");

        List<String> carsWithV = cars.stream()
                .filter(car -> car.startsWith("H"))
                .distinct()
                .toList();

        carsWithV.forEach(System.out::println);
    }
}
