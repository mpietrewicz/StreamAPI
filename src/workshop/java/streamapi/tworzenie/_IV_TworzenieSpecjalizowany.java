package workshop.java.streamapi.tworzenie;

import java.util.stream.IntStream;

public class _IV_TworzenieSpecjalizowany {

    public static void main(String[] args) {
        /*
               Interfejs: java.util.stream.IntStream
               static IntStream range(int startInclusive, int endExclusive)
               static IntStream rangeClosed(int startInclusive, int endInclusive)

               TODO utwórz 2 strumienie po 10 intów (1..10), wypisz je do konsoli - użyj obu metod.

           */

        IntStream.range(1, 11).forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.print(i + " "));

        System.out.println("");

        IntStream.range(1, 2).forEach(i -> System.out.print(i + " "));
        System.out.println("");
        IntStream.rangeClosed(1, 2).forEach( i -> System.out.print(i + " "));
    }
}


