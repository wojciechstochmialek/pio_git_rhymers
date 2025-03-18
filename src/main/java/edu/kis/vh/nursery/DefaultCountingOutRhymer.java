package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int n_size=12;
    private static final int full=11;
    private static final int empty=-1;
    private int[] NUMBERS = new int[n_size];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == empty;
    }

    public boolean isFull() {
        return total == full;
    }

    protected int top() {
        if (isEmpty())
            return empty;
        return NUMBERS[total];
    }

    public int pop() {
        if (isEmpty())
            return empty;
        return NUMBERS[total--];
    }

}
