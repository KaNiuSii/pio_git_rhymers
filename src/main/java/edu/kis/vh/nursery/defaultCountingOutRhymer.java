package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NEGATIVE_RESPONSE = -1;
    public static final int ARRAY_SIZE = 12;
    public static final int LAST_ARRAY_INDEX = 11;
    private final int[] NUMBERS = new int[ARRAY_SIZE];

    public int total = NEGATIVE_RESPONSE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_RESPONSE;
    }

    public boolean isFull() {
        return total == LAST_ARRAY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_RESPONSE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_RESPONSE;
        return NUMBERS[total--];
    }

}
