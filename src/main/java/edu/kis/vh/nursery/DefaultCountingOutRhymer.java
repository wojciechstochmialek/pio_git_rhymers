package edu.kis.vh.nursery;




/**
 * Ta klasa reprezentuje licznik, który działa na zasadzie stosu (LIFO).
 * Umożliwia operacje takie jak dodawanie liczby na stos, usuwanie liczby z wierzchu
 * stosu oraz sprawdzanie liczby na szczycie stosu.
 *
 * Działa zgodnie z zasadą "Last In, First Out" (LIFO), co oznacza, że ostatnia
 * dodana liczba jest pierwszą, którą można usunąć.

 */
public class DefaultCountingOutRhymer {

    private static final int NUMBERS_CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int FULL = NUMBERS_CAPACITY - 1;
    private final int[] numbers = new int[NUMBERS_CAPACITY];

    public int total = EMPTY;
    /**
     * Dodaje liczbę na stos.
     *
     * Ta metoda wstawia liczbę na szczyt stosu, umożliwiając dalsze operacje
     * na stosie, takie jak usuwanie liczb w kolejności LIFO.
     *
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * Sprawdza, ile elementów znajduje się na stosie.
     *
     * Ta metoda zwraca liczbę elementów, które zostały dodane do stosu, ale jeszcze nie zostały usunięte.
     * Jest to pomocne w monitorowaniu ilości elementów w stosie w trakcie jego użytkowania.
     *
     */

    public boolean callCheck() {
        return total == EMPTY;
    }
    /**
     * Sprawdza, czy stos jest pełny.
     *
     * Ta metoda zwraca wartość true, jeśli stos osiągnął swoją maksymalną pojemność,
     * w przeciwnym razie zwraca wartość false.
     *
     */
    public boolean isFull() {
        return total == FULL;
    }

    /**
     * Zwraca liczbę znajdującą się na szczycie stosu bez jej usuwania.
     *
     * Ta metoda umożliwia podejrzenie, jaka liczba znajduje się na wierzchu stosu
     * bez jej usuwania. Jeśli stos jest pusty, metoda powinna zwrócić wartość wskazującą na brak elementu.
     *
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }
    /**
     * Usuwa liczbę ze stosu.
     *
     * Ta metoda usuwa liczbę z wierzchu stosu i zwraca ją. Jeśli stos jest pusty,
     * metoda powinna zwrócić wartość wskazującą na brak elementu (np. -1).
     *
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
