package workshop.java.streamapi.tworzenie;

import java.util.Arrays;

public class _VII_TworzenieArrays {

    public static void main(String[] args) {

        /*
            Klasa: java.util.Arrays, analogicnzie dla strumieni Int, Long Double

            public static <T> Stream<T> stream(T[] array)
            public static <T> Stream<T> stream(T[] array, int startIncl, int endExcl)

            TODO utwórz 2-elementow strumień z tablicy Stringów
            "Adam", "Ewa","Piotr","Agnieszka"
            Wypisanie do konsoli wszystkich elementów strumienia powinno dać wynik:
            Ewa
            Piotr

           */




        Arrays
                .stream(new String[] {"Adam", "Ewa","Piotr","Agnieszka"},1,3)
                .forEach(System.out::println);
    }
}
