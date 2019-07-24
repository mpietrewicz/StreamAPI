package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _IV_Map {
    public static void main(String[] args) {
     /*

          map

          zwraca strumień powstały z zastosowania podanej funkcji
          do kolejnych elementów strumienia wejścciowego

          Stream<T> skip(long n)

          TODO utwórz listę z następującymi wartościami "B", "B", "C", "D", "A", "B", "C","E"

          Użyj map dla utworzenia strumienia wartości zmapowanych do lower case

          Wydrukuj wartości do konsoli
    */


    Collection<String> upperCaselist = Arrays.asList("B", "B", "C", "D", "A", "B", "C","E");
    List<String> lowerCaselist = upperCaselist.stream().map(String::toLowerCase).collect(Collectors.toList());

                        System.out.println(lowerCaselist);
    }
}
