package workshop.java.streamapi.tworzenie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _IX_TworzenieZPliku {

    public static void main(String[] args) {
        /*
            [Klasa: java.nio.file.Files]

            public static Stream<String> lines(Path path)
            public static Stream<String> lines(Path path, Charset cs)

            TODO
            utwórz plik test.txt w katalogu projektu
            w pliku dodaj kilka linii tekstu
            Użyj api z klasy File do wydrukowania wierszy pliku
           */


        Path path = Paths.get("test.txt");
        try (Stream<String> lines = Files.lines(path)) { lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
