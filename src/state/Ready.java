package state;

import factory.AccountAbstractFactory;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Operations for when the system is in a ready state.
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
        System.out.println("Already opened..enter 2,3 or 4");
    }

    @Override
    public void login() {
        System.out.println("Already logged in...enter 2,3 or 4");
    }

    @Override
    public void incorrectLogin() {System.out.println("enter 2,3 or 4");}

    @Override
    public void incorrectPin(int max) {
        attempts++;
        if(attempts<max) factory.getIncorrectPinMsg().incorrectPinMsg();
        else context.setCurrentState(context.getIdle());
    }

    @Override
    public void correctPinBelowMin() {System.out.println("enter 2,3 or 4");}

    @Override
    public void correctPinAboveMin() {System.out.println("enter 2,3 or 4");}

    @Override
    public void deposit() {
        factory.getMakeDeposit().makeDeposit();
        System.out.println("enter 2,3 or 4");
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
        System.out.println("enter 2,3 or 4");
    }

    @Override
    public void withdraw() {
        factory.getMakeWithdrawal().makeWithdrawal();
        System.out.println("enter 2,3 or 4");
    }

    @Override
    public void withdrawBelowMinBalance() {
        factory.getPenalty().penalty();
        context.setCurrentState(context.getOverdrawn());
    }

    @Override
    public void noFunds() {
        factory.getNoFundsMsg().noFundsMsg();
        System.out.println("enter 2 or 4");
    }

    @Override
    public void lock() {
        context.setCurrentState(context.getLocked());
    }

    @Override
    public void incorrectLock() {
       factory.getIncorrectLockMsg().incorrectLockMsg();
        System.out.println("view menu to lock");
    }

    @Override
    public void unlock() { System.out.println("enter 2 or 4");}

    @Override
    public void incorrectUnlock() { System.out.println("enter 2 or 4");}

    @Override
    public void suspend() {
        System.out.println("Account Suspended!");
        context.setCurrentState(context.getSuspended());
    }

    @Override
    public void activate() { System.out.println("enter 2 or 4");}

    @Override
    public void close() { System.out.println("enter 2 or 4");}
}
