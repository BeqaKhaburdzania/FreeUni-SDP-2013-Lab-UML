/**
 * Created by Giorgi on 3/17/2015.
 */
public abstract class Bank {
    protected BankServiceOrganizer bso;

    /**
     * @param index
     */
    public abstract void customerArrive(int index);

    /**
     * @param index
     */
    public abstract void endService(int index);

    /**
     *
     */
    public abstract void showStatus();
}
