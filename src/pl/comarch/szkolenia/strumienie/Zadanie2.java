package pl.comarch.szkolenia.strumienie;

import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        /*List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            if(!result.contains(element) && element > 3 && element < 7) {
                result.add(element);
            }
        }
        System.out.println(result);*/


        list.stream()
                .filter(x -> x > 3 && x < 7)
                .distinct()
                .skip(1)
                .limit(1)
                .map(x -> "Liczba: " + x)
                .forEach(System.out::println);
    }
}
