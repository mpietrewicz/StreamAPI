package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _I_Distinct {

    public static void main(String[] args) {
        /*

                   Stream<T> distinct()

                   TODO utwórz listę z następującymi wartościami "B", "B", "C", "D", "A", "B", "C","E"
                   Użyj distinct dla utworzenia listy o unikalnych wartościach
                   Wydrukuj listę do konsoli
                */



        Collection<String> list = Arrays.asList("B", "B", "C", "D", "A", "B", "C","E");

        List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctElements);

        List<String> lista = Arrays.asList("Aaa", "B", "C", "B", "B", "X", "Zz", "Aaa", "01", "C", "D", "A", "B", "C", "E");
        List<String> listaBezPowtorzen = lista.stream().distinct().collect(Collectors.toList());
        System.out.println(listaBezPowtorzen);
        listaBezPowtorzen.sort(Comparator.naturalOrder());
        System.out.println(listaBezPowtorzen);

    }
}
