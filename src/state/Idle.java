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
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void correctPinBelowMin() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void correctPinAboveMin() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void deposit() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void belowMinBalance() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void aboveMinBalance() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(this);
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void withdraw() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void withdrawBelowMinBalance() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void noFunds() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void lock() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void incorrectLock() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void unlock() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void incorrectUnlock() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void suspend() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void activate() {
        System.out.println("Please enter 0 to open account");
    }

    @Override
    public void close() {
        System.out.println("Please enter 0 to open account");
    }
}
