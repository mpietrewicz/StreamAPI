package workshop.java.streamapi.funcitons;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _VI {

    public static void main(String[] args) {

        /*
             Stream<T> peek(Consumer<? super T> action)

             Zwraca strumień złożony z tych samych elementów co wejściowy.
             Umożliwia wykonanie na każdym elemencie przekazanej funkcji, zastosowanie (z javadoc) - debug.

             TODO utwórz listę ze strumienia stringów Stream.of("aiid", "issi", "aig", "ib","cda","dioo","idioo")
             zastosuj kilka filtrowań
             - dłuższe niż 3 znaki
             - kończące się na i
             - jakiś własny pomysł : )

             Po każdym filtrowaniu użyj peek z drukowaniem do konsoli np. Filtrowana wartość: aiid

         */


        List<String> filteredValues = Stream.of("aiid", "issi", "aig", "ib","cda","dioo","idioo")
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("s.length() > 3 Filtrowana wartość: "+ s))
                .filter(s -> s.startsWith("i"))
                .peek(s -> System.out.println("s.startsWith(\"i\") Filtrowana wartość: "+ s))
                .filter(s -> s.endsWith("o"))
                .peek(s -> System.out.println("s.endsWith(\"o\") Filtrowana wartość: "+ s))
                .collect(Collectors.toList());

    }
}
