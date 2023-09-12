package pl.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(23,12,23,5,45,342,213,453,23,234,45,5,4,108);

        /*int sum = 0;
        for(int liczba : list) {
            sum += liczba;
        }
        double avr = ((double) sum) / list.size();
        System.out.println(avr);*/

        list.stream()
                .mapToInt(x -> x)
                .average()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Nie ma sredniej"));



    }
}
