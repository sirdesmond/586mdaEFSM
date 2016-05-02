package state;

import factory.AccountAbstractFactory;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Operations for when the system is in a locked state.
 */
public class Locked extends State{
    AccountContext context;
    AccountAbstractFactory factory;

    public Locked(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
    }


    @Override
    public void open() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void login() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void incorrectLogin() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void incorrectPin(int max) {System.out.println("Please enter 8 to unlock");}

    @Override
    public void correctPinBelowMin() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void correctPinAboveMin() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void deposit() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void belowMinBalance() {
        context.setCurrentState(context.getOverdrawn());
    }

    @Override
    public void aboveMinBalance() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void withdraw() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void withdrawBelowMinBalance() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void noFunds() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void lock() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void incorrectLock() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void unlock() {
        context.setCurrentState(context.getReady());
    }

    @Override
    public void incorrectUnlock() {
        factory.getIncorrectUnlockMsg().incorrectUnlockMsg();
    }

    @Override
    public void suspend() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void activate() {System.out.println("Please enter 8 to unlock");}

    @Override
    public void close() {System.out.println("Please enter 8 to unlock");}
}
