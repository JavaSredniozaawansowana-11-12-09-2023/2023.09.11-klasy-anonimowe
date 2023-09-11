package pl.comarch.szkolenia.funkcyjny;

import pl.comarch.szkolenia.klasy.anonimowe.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> "Liczba: " + i;
        System.out.println(function.apply(5));
        System.out.println(function.apply(10));
        System.out.println(function.apply(15));

        BiFunction<String, Integer, Boolean> biFunction = (s, i) -> s.length() > i;

        System.out.println(biFunction.apply("Mateusz", 7));
        System.out.println(biFunction.apply("cos", 5));
        System.out.println(biFunction.apply("cos innego", 2));


        UnaryOperator<Integer> unaryOperator = i -> {
            if(i < 3) {
                return i*10;
            } else if (i == 10) {
                return i;
            } else {
                return i * 2;
            }
        };

        System.out.println(unaryOperator.apply(15));
        System.out.println(unaryOperator.apply(5));

        Predicate<Car> predicate = car -> car.getBrand().equals("BMW");

        System.out.println(predicate.test(new Car("BMW", "3", 300)));
        System.out.println(predicate.test(new Car("Audi", "A3", 300)));

        Supplier<Car> defaultCarSupplier = () -> new Car("default", "default", 0);

        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());
        System.out.println(defaultCarSupplier.get());

        Consumer<Car> carConsumer = System.out::println;

        carConsumer.accept(new Car("Toyota", "Corolla", 200));
        carConsumer.accept(defaultCarSupplier.get());
    }
}
