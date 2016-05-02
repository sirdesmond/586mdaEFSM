package state;

import factory.AccountAbstractFactory;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Operations for when the system is in a suspended state
 */
public class Suspended extends State{
    AccountContext context;
    AccountAbstractFactory factory;

    public Suspended(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
    }


    @Override
    public void open() { System.out.println("enter 8 to activate");}

    @Override
    public void login() {System.out.println("enter 8 to activate");}

    @Override
    public void incorrectLogin() {System.out.println("enter 8 to activate");}

    @Override
    public void incorrectPin(int max) {System.out.println("enter 8 to activate");}

    @Override
    public void correctPinBelowMin() {System.out.println("enter 8 to activate");}

    @Override
    public void correctPinAboveMin() {System.out.println("enter 8 to activate");}

    @Override
    public void deposit() {System.out.println("enter 8 to activate");}

    @Override
    public void belowMinBalance() {System.out.println("enter 8 to activate");}

    @Override
    public void aboveMinBalance() {System.out.println("enter 8 to activate");}

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {
        factory.getDisplayBalance().displayBalance();
        System.out.println("enter 8 to activate");
    }

    @Override
    public void withdraw() {System.out.println("enter 8 to activate");}

    @Override
    public void withdrawBelowMinBalance() {System.out.println("enter 8 to activate");}

    @Override
    public void noFunds() {System.out.println("enter 8 to activate");}

    @Override
    public void lock() {System.out.println("enter 8 to activate");}

    @Override
    public void incorrectLock() {System.out.println("enter 8 to activate");}

    @Override
    public void unlock() {System.out.println("enter 8 to activate");}

    @Override
    public void incorrectUnlock() {System.out.println("enter 8 to activate");}

    @Override
    public void suspend() {System.out.println("enter 8 to activate");}

    @Override
    public void activate() {
        context.setCurrentState(context.getReady());
        System.out.println("Account activated!");
    }

    @Override
    public void close() {
        System.out.println("Bye!");
        System.exit(1);
    }
}
