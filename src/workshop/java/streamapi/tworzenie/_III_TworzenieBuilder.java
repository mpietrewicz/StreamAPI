package workshop.java.streamapi.tworzenie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _III_TworzenieBuilder {

    public static void main(String[] args) {

    /*
           Interfejs: java.util.stream.Stream
           static <T> Stream.Builder<T> builder()

           TODO utwórz strumień 4 stringów (pory roku), używając buildera
           Wypisz do konsoli wszystkie wartości
       */


    Stream.<String>builder()
            .add("Spring")
            .add("Summer")
            .add("Autumn")
            .add("Winter")
            .build()
            .forEach(System.out::println);

    System.out.println("---");

    Stream<String> poryRoku = Stream.<String>builder()
            .add("Wiosna")
            .add("Lato")
            .add("Jesień")
            .add("Zimia")
            .build();

    poryRoku.forEach(s -> System.out.println(s));

    }
}
