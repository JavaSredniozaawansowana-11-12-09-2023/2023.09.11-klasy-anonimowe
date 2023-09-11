package pl.comarch.szkolenia.opcjonalne;

import pl.comarch.szkolenia.klasy.anonimowe.Car;
import pl.comarch.szkolenia.klasy.anonimowe.Suppliers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

public class App {

    static List<Car> cars = List.of(
            new Car("Audi", "A5", 300),
            new Car("Toyota", "Corolla", 200),
            new Car("BMW", "5", 350),
            new Car("Kia", "Ceed", 100),
            new Car("Skoda", "Fabia", 120)
    );

    public static void main(String[] args) {
        Optional<Car> carBox = findCar("Audi");
        /*if(carBox.isPresent()) {
            Car car = carBox.get();
            car.setPrice(500);
            System.out.println(car);
        }*/
        Car car = carBox.orElseGet(Suppliers.DEFAULT_CAR_SUPPLIER);
        System.out.println(car);

        //carBox.orElseThrow(NoCarFoundException::new);

        //carBox.ifPresentOrElse();

        /*if(carBox.isPresent()) {
            System.out.println(carBox.get());
        } else {
            System.out.println("Nie ma auta !!!");
        }*/

        carBox.ifPresentOrElse(System.out::println, () -> System.out.println("Nie ma auta !!"));

        Optional<String> s = carBox.map(c -> c.getModel());

        String model = carBox.get().getModel();

    }

    public static Optional<Car> findCar(String brand) {
        for(Car car : cars) {
            if(car.getBrand().equals(brand)) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }
}
