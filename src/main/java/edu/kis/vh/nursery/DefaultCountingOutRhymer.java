package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int CAPACITY = 12;
    private final int ILLEGAL_INDEX = -1;
    private final int[] numbers = new int[CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = ILLEGAL_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ILLEGAL_INDEX;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ILLEGAL_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ILLEGAL_INDEX;
        return numbers[total--];
    }

}
