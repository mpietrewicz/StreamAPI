package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FiltrowanieITransfer {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("aa", "ba", "ac", "ad", "ea", "fa");

        // odfiltorwanie zaczynające sie na a
        Predicate<String> notStartWithA = p -> !p.startsWith("a");
        List<String> listWithoutA = list.stream().filter(notStartWithA).collect(Collectors.toList());
        System.out.println(listWithoutA);

        // przetransferowanie do wielkich liter
        List<String> listWithoutAUpperCase = listWithoutA.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(listWithoutAUpperCase);

        System.out.println("---");

        list
            .stream()
            .filter(notStartWithA)
            .map(String::toUpperCase)
            .peek(s -> System.out.print(s +" "))
            .collect(Collectors.toList());


    }

}
