package mdaevents;

import state.AccountContext;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete Implementation for the IEvents
 */
public class EventsImpl implements IEvents{
    AccountContext context;

    public EventsImpl(AccountContext ctx) {
        this.context = ctx;
    }

    @Override
    public void open() {
        context.open();
    }

    @Override
    public void login() {
        context.login();
    }

    @Override
    public void incorrectLogin() {
        context.incorrectLogin();
    }

    @Override
    public void incorrectPin(int max) {
        context.incorectPin(max);
    }

    @Override
    public void correctPinBelowMin() {
        context.correctPinBelowMin();
    }

    @Override
    public void correctPinAboveMin() {
        context.correctPinAboveMin();
    }

    @Override
    public void deposit() {
        context.deposit();
    }

    @Override
    public void belowMinBalance() {
        context.belowMinBalance();
    }

    @Override
    public void aboveMinBalance() {
        context.aboveMinBalance();
    }

    @Override
    public void logout() {
        context.logout();
    }

    @Override
    public void balance() {
        context.balance();
    }

    @Override
    public void withdraw() {
        context.withdraw();
    }

    @Override
    public void withdrawBelowMinBalance() {
        context.withdrawBelowMinBalance();
    }

    @Override
    public void noFunds() {
        context.noFunds();
    }

    @Override
    public void lock() {
        context.lock();
    }

    @Override
    public void incorrectLock() {
        context.incorrectLock();
    }

    @Override
    public void unlock() {
        context.unlock();
    }

    @Override
    public void incorrectUnlock() {
        context.incorrectUnlock();
    }

    @Override
    public void suspend() {
        context.suspend();
    }

    @Override
    public void activate() {
        context.activate();
    }

    @Override
    public void close() {
        context.close();
    }
}
