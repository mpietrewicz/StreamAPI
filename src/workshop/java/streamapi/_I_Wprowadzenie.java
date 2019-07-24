package workshop.java.streamapi;

public class _I_Wprowadzenie {


/*

    Strumienie to nie kolekcje!

    - nie przechowują danych, dane są przekazywane ze źródła
      (kolekcja, tablica, funkcja generująca, I/O), przez łańuch operacji,
      do strumienia wyjściowego

    - operacja na strumieniu zwraca jakąś wartość, ale nie modyfikuje źródła
      np. filtrowanie kolekcji tworzy nowy strumień, a nie usuwa elementy w kolekcji

    - intermediate (tworzące nowy strumień, lazy) vs
    terminal (wartość lub efekt uboczny)

    - mogą być nieskończone
        funkcja generująca tworzy strumień nieskończony
        możliwość ograniczania rozmiaru takimi metodami jak limit(n) findFirst(n)

    - elementy strumienia odwiedzane są tylko raz, podczas 'życia' strumienia
     dla ponownego odwiedzenia elementu potrzeba wygenerować nowy strumień

    - nie mogą być wielokrotnie wykorzystywane (stąd nazwa terminal operation)

    - możliwość kaskadowego wywoływania funkcji (floating interface)

    - strumienie realizują iterację wewnętrzną, a kolekcje - zewnętrzną

    - możemy tworzyć puste strumienie

*/

}
























