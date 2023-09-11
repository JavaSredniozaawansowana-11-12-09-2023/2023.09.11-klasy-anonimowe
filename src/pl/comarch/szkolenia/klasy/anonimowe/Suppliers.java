package pl.comarch.szkolenia.klasy.anonimowe;

import java.util.function.Supplier;

public interface Suppliers {
    Supplier<Car> DEFAULT_CAR_SUPPLIER = () -> new Car("BMW", "default", 100);
    Supplier<Client> DEFAULT_CLIENT_SUPPLIER = null;

}
