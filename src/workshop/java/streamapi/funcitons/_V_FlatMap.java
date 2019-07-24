package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.stream.Stream;

public class _V_FlatMap {
    public static void main(String[] args) {
    /*

         filter, sum, distinct nie wspiera Stream<String[]>, Stream<List<String>> itp.


         Stream<String[]>           flatMap      Stream<String>

         { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}


         { {"a,"b"}, {"c","d"}, {"e","f"},{"e","a"} } -> flatMap -> {"a","b","c","d","e","f","e","a"}



         TODO utwórz tablię jak na powyższym przykładzie,
          użyj stream API do
                         - odfiltrowania "a",
                         - zmapuj do UpperCase

          Wyświetl do konsoli elementy zmapowanego strumienia.
        */


        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"e", "a"}};

        Stream<String[]> stringArrayStream = Arrays.stream(data);
        Stream<String> stringStream = stringArrayStream.flatMap(array -> Arrays.stream(array));
        stringStream.filter(s -> s.equals("a"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

    }
}
