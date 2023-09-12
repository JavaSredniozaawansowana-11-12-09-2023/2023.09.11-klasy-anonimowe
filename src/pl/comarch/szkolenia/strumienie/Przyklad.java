package pl.comarch.szkolenia.strumienie;

import java.util.List;

public class Przyklad {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,7,5,6,7,8,9);

        list.stream()
                .filter(x -> x > 4)
                .peek(System.out::println)
                .limit(1)
                .forEach(System.out::println);


    }
}
