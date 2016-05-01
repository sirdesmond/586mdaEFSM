package state;

import factory.AccountAbstractFactory;

/**
 * Created by kofikyei on 4/30/16.
 */
public class Overdrawn extends State{
    AccountContext context;
    AccountAbstractFactory factory;

    public Overdrawn(AccountContext context, AccountAbstractFactory factory) {
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
        factory.getMakeDeposit().makeDeposit();
    }

    @Override
    public void belowMinBalance() {
        factory.getNoFundsMsg().noFundsMsg();
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
