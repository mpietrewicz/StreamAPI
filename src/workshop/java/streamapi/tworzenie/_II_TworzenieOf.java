package workshop.java.streamapi.tworzenie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _II_TworzenieOf {
    public static void main(String[] args) {
        /*
               Intefejs:  java.util.stream.Stream<T>

               static <T> Stream<T> of(T t)
               static <T> Stream<T> of(T... values)

               TODO tworzymy dwa strumienie, wykorzystujac powyższe API
                    wykorzystajmy lambdę / referencję do wypisania do konsoli
                    wartości ze strumieni

           */



        Stream<String> greeting = Stream.of("Hello");
        Stream<String> seasons = Stream.of("Spring", "Summer", "Autumn",
                "Winter");

        greeting.forEach(s -> System.out.println(s));
        seasons.forEach(System.out::println);

        System.out.println("---");

        Stream<String> myGreeting = Stream.of("Witaj");
        List<String> alphabet = Arrays.asList("a", "b", "c", "d");
        Stream<String> mySeasons = alphabet.stream();

        myGreeting.forEach(s -> System.out.println(s));
//        mySeasons.forEach(s -> System.out.println(s)); // stream nie pozwoli użyć drugi raz forEach
        mySeasons.forEach(System.out::println);

    }
}