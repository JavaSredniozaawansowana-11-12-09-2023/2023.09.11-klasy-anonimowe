package pl.comarch.szkolenia.funkcyjny;

import java.util.function.Function;

public class Funkcja implements Function<Integer, String> {
    @Override
    public String apply(Integer integer) {
        return "Liczba: " + integer;
    }
}
