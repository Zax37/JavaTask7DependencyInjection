# Java w zastosowaniach produkcyjnych

## Zadanie 7 - Wstrzykiwanie zależności do konstruktora - String

Używając źródeł z wykładów, przerobić CSVMovieFinder tak, aby można było podać mu nazwę pliku źródłowego
jako parametr konstruktora, a jednocześnie aby był prawidłowym Spring Beanem.

Zmodyfikować SpringMain i / lub tak, aby cały program działał z wstrzykiwaną nazwą pliku jako parametr programu.

Przykładowe wywołanie:

- java -jar build/libs/w4-di-1.0-SNAPSHOT.jar movies.txt
