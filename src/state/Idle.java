package state;

import factory.AccountAbstractFactory;

/**
 * Created by kofikyei on 4/30/16.
 */
public class Idle extends State{

    AccountContext context;
    AccountAbstractFactory factory;

    public Idle(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
    }

    @Override
    public void open() {
        factory.getStoreData().storeData();
        System.out.println("Please enter 5 to login");

    }

    @Override
    public void login() {
        System.out.println("Login successful!");
        context.setCurrentState(context.getCheckPin());
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void incorrectLogin() {
        factory.getIncorrectIdMsg().incorrectIdMsg();
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

    }

    @Override
    public void aboveMinBalance() {

    }

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(this);
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

    }

    @Override
    public void incorrectUnlock() {

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
