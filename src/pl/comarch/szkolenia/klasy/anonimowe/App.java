package pl.comarch.szkolenia.klasy.anonimowe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Janusz");
        list.add("Adam");
        list.add("Wiesiek");
        list.add("Mateusz");
        list.add("Bogdan");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", "A5", 300));
        cars.add(new Car("Toyota", "Corolla", 200));
        cars.add(new Car("BMW", "5", 350));
        cars.add(new Car("Kia", "Ceed", 100));
        cars.add(new Car("Skoda", "Fabia", 120));

        System.out.println(cars);

        Collections.sort(cars, (car1, car2) -> car1.getPrice() - car2.getPrice());

        Collections.sort(cars, (car1, car2) -> car1.getBrand().compareTo(car2.getBrand()));

        System.out.println(cars);

        Inerfejs inerfejs = new Inerfejs() {
            @Override
            public void a() {

            }

            @Override
            public int b() {
                return 0;
            }

            @Override
            public String c() {
                return null;
            }
        };
    }
}
