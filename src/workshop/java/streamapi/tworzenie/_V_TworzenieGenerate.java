package workshop.java.streamapi.tworzenie;

import java.util.Random;
import java.util.stream.Stream;

public class _V_TworzenieGenerate {

    public static void main(String[] args) {
        /*
                     Interfejs: java.util.stream.Stream<T>
                     static <T> Stream<T> generate(Supplier<T> s)


                     TODO użyj metody generate do utworzenia 10 randomowych intów (skorzystaj z klasy Random),
                     wypisz je do konsoli.


                */

        Stream.generate(new Random()::nextInt)
                .limit(10).forEach(System.out::println);
    }
}
