package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.List;

public class _VII {
    public static void main(String[] args) {

               /*
                     Optional<T> findFirst()

                     Optional<T> findAny()

                     TODO utwórz listę "A","B","C","x","D","E", użyj findFirst i findAny",
                     wydrukuj do konsoli.

                */

                List<String> list = Arrays.asList("A","B","C","D","E");
                list.stream().findAny().ifPresent(System.out::println);
                list.stream().findFirst().ifPresent(System.out::println);


    }
}
