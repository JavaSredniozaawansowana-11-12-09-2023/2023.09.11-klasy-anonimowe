package pl.comarch.szkolenia.strumienie;

import pl.comarch.szkolenia.klasy.anonimowe.Car;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,1,2,3,4,5,6,7,8,9,0,0,1,0,1);

        list.stream()
                .mapToDouble(i -> i)
                .boxed()
                .forEach(System.out::println);

        /*List<Car> cars = List.of(
                new Car("Car1", "11", 100),
                new Car("Car2", "22", 200),
                new Car("Car3", "33", 300)
        );

        cars.stream()
                .mapToInt(car -> car.getPrice())
                .forEach(System.out::println);*/


        /*List<Car> cars = List.of(
                new Car("Car1", "11", 100),
                new Car("Car2", "22", 200),
                new Car("Car3", "33", 300)
        );

        List<Car> cars2 = cars.stream().map(car -> new Car(car.getBrand(), car.getModel(), 500)).toList();

        System.out.println(cars);
        System.out.println(cars2);*/


        //Stream.iterate(0, i -> i + 1).filter(x -> x > 10000000).limit(10).forEach(System.out::println);


        /*List<String> strings = List.of("abc", "bcd", "cde", "efg");
        boolean result = strings.stream().anyMatch(s -> s.matches(".z."));
        System.out.println(result);*/
    }
}
