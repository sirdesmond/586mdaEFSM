package state;

import factory.AccountAbstractFactory;

/**
 * Created by kofikyei on 4/30/16.
 */
public class Locked extends State{
    AccountContext context;
    AccountAbstractFactory factory;

    public Locked(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
    }


    @Override
    public void open() {

    }

    @Override
    public void login() {

    }

    @Override
    public void incorrectLogin() {

    }

    @Override
    public void incorrectPin(int max) {

    }

    @Override
    public void correctPinBelowMin() {

    }

    @Override
    public void correctPinAboveMin() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public void belowMinBalance() {
        context.setCurrentState(context.getOverdrawn());
    }

    @Override
    public void aboveMinBalance() {

    }

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void withdrawBelowMinBalance() {

    }

    @Override
    public void noFunds() {

    }

    @Override
    public void lock() {

    }

    @Override
    public void incorrectLock() {

    }

    @Override
    public void unlock() {
        context.setCurrentState(context.getReady());
    }

    @Override
    public void incorrectUnlock() {
        factory.getIncorrectUnlockMsg().incorrectUnlockMsg();
    }

    @Override
    public void suspend() {

    }

    @Override
    public void activate() {

    }

    @Override
    public void close() {

    }
}
