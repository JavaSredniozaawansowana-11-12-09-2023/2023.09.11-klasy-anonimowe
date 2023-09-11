package pl.comarch.szkolenia.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        readAndCalculate(App2::readDataFromDB, App2::calculate1);
        readAndCalculate(App2::readDataFromFile, App2::calculate2);
        readAndCalculate(App2::readDataFromWeb, App2::calculate3);
    }

    public static int readDataFromFile() {
        return 5;
    }

    public static int readDataFromDB() {
        return 10;
    }

    public static int readDataFromWeb() {
        return 20;
    }

    public static int calculate1(int a) {
        return a * 10;
    }

    public static int calculate2(int a) {
        return a * 20;
    }

    public static int calculate3(int a) {
        return a * 100;
    }

    public static int readAndCalculate(Supplier<Integer> reader,
                                       UnaryOperator<Integer> calculator) {
        return calculator.apply(reader.get());
    }
}
