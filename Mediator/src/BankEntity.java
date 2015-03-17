
public abstract class BankEntity {
    BankServiceOrganizer bOrganizer;

    /**
     *
     * @param bankServiceOrganizer
     */
    public BankEntity(BankServiceOrganizer bankServiceOrganizer) {
        this.bOrganizer = bankServiceOrganizer;
    }

    /**
     *
     */
    public void changed() {
        bOrganizer.entityChanged(this);
    }
}
