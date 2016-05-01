package state;

import factory.AccountAbstractFactory;

/**
 * Created by kofikyei on 4/30/16.
 */
public class CheckPin extends State {

    AccountContext context;
    AccountAbstractFactory factory;
    int attempts;

    public CheckPin(AccountContext context, AccountAbstractFactory factory) {
        this.context = context;
        this.factory = factory;
        attempts = 0;
    }

    @Override
    public void open() {
        System.out.println("You're already logged in...Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void login() {
        System.out.println("You're already logged in...Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void incorrectLogin() {
        System.out.println("You're already logged in...Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void incorrectPin(int max) {
        attempts++;
        if(attempts<max){
            factory.getIncorrectPinMsg().incorrectPinMsg();
        }else {
            factory.getTooManyAttemptsMsg().tooManyAttemptsMsg();
            context.setCurrentState(context.getIdle());
        }
    }

    @Override
    public void correctPinBelowMin() {
        System.out.println("Correct Pin but balance below minimum");
        factory.getDisplayBalance().displayBalance();
    }

    @Override
    public void correctPinAboveMin() {
        context.setCurrentState(context.getReady());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void deposit() {
        System.out.println("Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void belowMinBalance() {}

    @Override
    public void aboveMinBalance() {}

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {
        System.out.println("Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void withdraw() {
        System.out.println("Enter Pin!");
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void withdrawBelowMinBalance() {}

    @Override
    public void noFunds() {}

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
