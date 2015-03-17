
public class Queue extends BankEntity {
    private int size;

    /**
     * @param bo
     */
    public Queue(BankServiceOrganizer bo) {
        super(bo);
    }

    /**
     *
     */
    public void dequeue() {
        if (size > 0)
            size--;
    }

    /**
     *
     */
    public void enqueue() {
        size++;
        changed();
    }

    /**
     * @return
     */
    public int getSize() {
        return size;
    }
}
