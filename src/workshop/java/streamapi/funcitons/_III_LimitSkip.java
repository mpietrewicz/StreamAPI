package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _III_LimitSkip {

    public static void main(String[] args) {
        /*

               Stream<T> limit(long maxSize)

               Stream<T> skip(long n)

               TODO utwórz listę z następującymi wartościami "B", "B", "C", "D", "A", "B", "C","E"

               Utwórz 3-elementową listę używając limit
               Utwórz 3-elementową listę używając skip

               Wydrukuj listy do konsoli
            */


        Collection<String> list = Arrays.asList("B", "B", "C", "D", "A", "B", "C","E");

        List<String> first3elements = list.stream().limit(3).collect(Collectors.toList());
        List<String> last3elements = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(first3elements);
        System.out.println(last3elements);

    }
}



