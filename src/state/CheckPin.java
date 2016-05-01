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
        context.setCurrentState(context.getOverdrawn());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void correctPinAboveMin() {
        context.setCurrentState(context.getReady());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void deposit() {
        factory.getPromptForPin().promptForPin();
    }

    @Override
    public void belowMinBalance() {factory.getPromptForPin().promptForPin();}

    @Override
    public void aboveMinBalance() {factory.getPromptForPin().promptForPin();}

    @Override
    public void logout() {
        System.out.println("Bye!");
        context.setCurrentState(context.getIdle());
        factory.getDisplayMenu().displayMenu();
    }

    @Override
    public void balance() {factory.getPromptForPin().promptForPin();}

    @Override
    public void withdraw() {factory.getPromptForPin().promptForPin();}

    @Override
    public void withdrawBelowMinBalance() {factory.getPromptForPin().promptForPin();}

    @Override
    public void noFunds() {factory.getPromptForPin().promptForPin();}

    @Override
    public void lock() {factory.getPromptForPin().promptForPin();}

    @Override
    public void incorrectLock() {factory.getPromptForPin().promptForPin();}

    @Override
    public void unlock() {factory.getPromptForPin().promptForPin();}

    @Override
    public void incorrectUnlock() {factory.getPromptForPin().promptForPin();}

    @Override
    public void suspend() {factory.getPromptForPin().promptForPin();}

    @Override
    public void activate() {factory.getPromptForPin().promptForPin();}

    @Override
    public void close() {factory.getPromptForPin().promptForPin();}
}
