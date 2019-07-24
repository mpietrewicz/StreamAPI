package workshop.java.streamapi.tworzenie;

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

    }
}