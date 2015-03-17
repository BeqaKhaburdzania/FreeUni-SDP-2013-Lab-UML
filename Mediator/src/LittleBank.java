
public class LittleBank extends Bank {

    public LittleBank() {
        this.bso = new LittleBankServiceOrganizer();
        ((LittleBankServiceOrganizer) bso).createBankEntities();
        System.out.println("----------------------");
        System.out.println("Queue number: " + ((LittleBankServiceOrganizer) bso).getQueueNumber());
        System.out.println("Teller number: " + ((LittleBankServiceOrganizer) bso).getTellerNumber());
    }

    @Override
    public void customerArrive(int index) {
        ((LittleBankServiceOrganizer) bso).getQueue(index).enqueue();
    }

    @Override
    public void endService(int index) {
        ((LittleBankServiceOrganizer) bso).getTeller(index).endService();
    }

    @Override
    public void showStatus() {
        System.out.println("----------------------");
        for (int i = 1; i <= ((LittleBankServiceOrganizer) bso).getTellerNumber(); i++)
            System.out.println("Teller " + i + " status: " +
                    (((LittleBankServiceOrganizer) bso).getTeller(i).isFree() ? "FREE" : "BUSY"));
        for (int i = 1; i <= ((LittleBankServiceOrganizer) bso).getQueueNumber(); i++)
            System.out.println("Queue " + i + " size: " + ((LittleBankServiceOrganizer) bso).getQueue(i).getSize());

    }

//    private Queue queue1, queue2;
//    private Teller teller1, teller2;
//
//    public LittleBank() {
//        LittleBankServiceOrganizer lbso = new LittleBankServiceOrganizer();
//        lbso.createBankEntities();
//        System.out.println("----------------------");
//        System.out.println("Queue number: " + lbso.getQueueNumber());
//        System.out.println("Teller number: " + lbso.getTellerNumber());
//        queue1 = lbso.getQueue(1);
//        queue2 = lbso.getQueue(2);
//        teller1 = lbso.getTeller(1);
//        teller2 = lbso.getTeller(2);
//    }
//
//    public void customerArriveToQ1() {
//        queue1.enqueue();
//    }
//
//    public void customerArriveToQ2() {
//        queue2.enqueue();
//    }
//
//    public void endServiceTeller1() {
//        teller1.endService();
//    }
//
//    public void endServiceTeller2() {
//        teller2.endService();
//    }
//
//    public void showStatus() {
//        System.out.println("----------------------");
//        System.out.println("Teller 1 status: " + (teller1.isFree() ? "FREE" : "BUSY"));
//        System.out.println("Teller 2 status: " + (teller2.isFree() ? "FREE" : "BUSY"));
//
//        System.out.println("Queue 1 size: " + queue1.getSize());
//        System.out.println("Queue 2 size: " + queue2.getSize());
//    }
}
