package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int n_size = 12;
    private static final int empty = -1;
    private static final int full = 11;
    private int[] numbers = new int[n_size];
    public int total = empty;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == empty;
    }

    public boolean isFull() {
        return total == full;
    }

    protected int peekaboo() {
        if (callCheck())
            return empty;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return empty;
        return numbers[total--];
    }

}
