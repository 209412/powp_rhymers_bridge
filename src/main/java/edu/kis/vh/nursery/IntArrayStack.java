package edu.kis.vh.nursery;

public class IntArrayStack implements IntStack {
	private static final int STACK_SIZE = 12;
	private static final int FULL_COUNT = STACK_SIZE-1;
	private static final int STACK_EMPTY = -1;

	private int[] numbers = new int[STACK_SIZE];

	private int total = STACK_EMPTY;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#getTotal()
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#countIn(int)
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == STACK_EMPTY;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == FULL_COUNT;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#peekAboo()
	 */
	@Override
	public int peekAboo() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.IntStack#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return STACK_EMPTY;
		return numbers[total--];
	}
}
