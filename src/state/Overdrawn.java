package state;

import factory.AccountAbstractFactory;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Operations for when the system is in an overdrawn state.
 */
public class Overdrawn extends State{
    AccountContext context;
    AccountAbstractFactory factory;

    public Overdrawn(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
    }


    @Override
    public void open() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void login() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void incorrectLogin() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void incorrectPin(int max) {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void correctPinBelowMin() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void correctPinAboveMin() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void deposit() {
        factory.getMakeDeposit().makeDeposit();
        System.out.println("Please enter 2 to deposit or 4 to view balance");
    }

    @Override
    public void belowMinBalance() {
        System.out.println("Please enter 2 to deposit or 4 to view balance");
    }

    @Override
    public void aboveMinBalance() {
        context.setCurrentState(context.getReady());
    }

    @Override
    public void logout() {

        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {
        factory.getDisplayBalance().displayBalance();
    }

    @Override
    public void withdraw() {
        System.out.println("WARNING: You have Insufficient funds!!");
    }

    @Override
    public void withdrawBelowMinBalance() {
        System.out.println("WARNING: You have Insufficient funds!!");
        factory.getPenalty().penalty();
    }

    @Override
    public void noFunds() {
        System.out.println("Please enter 2 to deposit or 4 to view balance");
    }

    @Override
    public void lock() {
        context.setCurrentState(context.getLocked());
    }

    @Override
    public void incorrectLock() {
        factory.getIncorrectLockMsg().incorrectLockMsg();
    }

    @Override
    public void unlock() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void incorrectUnlock() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void suspend() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void activate() {System.out.println("Please enter 2 to deposit or 4 to view balance");}

    @Override
    public void close() {System.out.println("Please enter 2 to deposit or 4 to view balance");}
}
