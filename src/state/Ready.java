package state;

import factory.AccountAbstractFactory;

/**
 * Created by kofikyei on 4/30/16.
 */
public class Ready extends State{

    AccountContext context;
    AccountAbstractFactory factory;
    int attempts;

    public Ready(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
        attempts = 0;
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
        attempts++;
        if(attempts<max) factory.getIncorrectPinMsg().incorrectPinMsg();
        else context.setCurrentState(context.getIdle());
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
        System.out.println("Balance below minimum");
    }

    @Override
    public void aboveMinBalance() {
        System.out.println("Balance above minimum");
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
        factory.getMakeWithdrawal().makeWithdrawal();
    }

    @Override
    public void withdrawBelowMinBalance() {
        factory.getPenalty().penalty();
        context.setCurrentState(context.getOverdrawn());
    }

    @Override
    public void noFunds() {
        factory.getNoFundsMsg().noFundsMsg();
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
        System.out.println("Account Suspended!");
        context.setCurrentState(context.getSuspended());
    }

    @Override
    public void activate() {

    }

    @Override
    public void close() {

    }
}
