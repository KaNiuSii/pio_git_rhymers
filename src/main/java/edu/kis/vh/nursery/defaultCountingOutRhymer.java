package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int ERROR_VALUE = -1;

    public static final int DEFAULT_VALUE = -1;
    public static final int ARRAY_SIZE = 12;
    public static final int LAST_ARRAY_INDEX = ARRAY_SIZE - 1;
    private final int[] NUMBERS = new int[ARRAY_SIZE];

    public int total = DEFAULT_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_VALUE;
    }

    public boolean isFull() {
        return total == LAST_ARRAY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return NUMBERS[total--];
    }

}
