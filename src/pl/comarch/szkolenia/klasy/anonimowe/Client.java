package pl.comarch.szkolenia.klasy.anonimowe;

public class Client {
    private String name;
    private String surname;
    private Address address;

    public class Address {
        String city;
        String street;
        String on;
    }
}
