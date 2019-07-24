package workshop.java.streamapi.funcitons;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _II_Predicate {

    public static void main(String[] args) {
    /*
        Stream<T> filter(Predicate<? super T> predicate)

        Funkcja zwraca strumień zawierający elementy spełniające podany predykat

        TODO
          Utwórz klasę Person name:String, age: int
          Utwórz dwa predykaty - nazwisko kończące się na "i", wiek poniżej 18 lat

         Utwórz listę kilku obiektów Person.

         Utwórz 3 listy używając filter
          Obiekty z nazwiskami kończącymi się na i.
          Obiekty z wiekiem poniżej 18 lat.
          Obiekty z nazwiskami kończącymi się na i && wiekiem poniżej 18 lat.

                         */

        List<Person> people = Arrays.asList(
                new Person("Kowalski", 40),
                new Person("Kowalski", 17),
                new Person("Kowalska", 30),
                new Person("Kowalska", 15),
                new Person("Nowak", 20),
                new Person("Nowicka", 50),
                new Person("Kowal", 30)
        );

        Predicate<Person> below18 = p -> p.getAge() < 18;
        Predicate<Person> endsWithI = p -> p.getName().endsWith("i");


        List<Person> below18List = people
                .stream()
                .filter(below18).collect(Collectors.toList());

        List<Person> endsWithIList = people
                .stream()
                .filter(below18.and(endsWithI)).collect(Collectors.toList());


    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
