package workshop.java.streamapi.tworzenie;

import java.util.stream.IntStream;

public class _VI_TworzenieIterate {
    public static void main(String[] args) {
        /*
                   Interfejs: java.util.stream.Stream<T>
                   static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)


                   TODO użyj metody iterate do utworzenia strumienia intów,
                   wypisz do konsoli następujących wartości:

                   1
                   2
                   4
                   8
                   16
                   32
                   64
                   128
                   256
                   512
              */


        IntStream.iterate(1, n -> n*2) .limit(10).forEach(System.out::println);
    }
}

