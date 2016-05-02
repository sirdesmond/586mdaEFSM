package state;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for the various states
 */
public abstract class State {

    /**
     * opens an account
     */
    public abstract void open();

    /**
     * login into account
     */
    public abstract void login();

    /**
     * incorrect login
     */
    public abstract void incorrectLogin();

    /**
     * incorrect pin given
     * @param max
     */
    public abstract void incorrectPin(int max);

    /**
     * correct pin but balance below minimum
     */
    public abstract void correctPinBelowMin();

    /**correct pin and balance above minimum
     *
     */
    public abstract void correctPinAboveMin();

    /**
     * deposit into account
     */
    public abstract void deposit();

    /**
     * balance below minimum
     */
    public abstract void belowMinBalance();

    /**
     * balance above minimum
     */
    public abstract void aboveMinBalance();

    /**
     * logout
     */
    public abstract void logout();

    /**
     * check balance
     */
    public abstract void balance();

    /**
     * withdraw from account
     */
    public abstract void withdraw();

    /**
     * balance after withdrawal below minimum
     */
    public abstract void withdrawBelowMinBalance();

    /**
     * no funds in account
     */
    public abstract void noFunds();

    /**
     * lock account
     */
    public abstract void lock();

    /**
     * incorrect pin provided for lock operation
     */
    public abstract void incorrectLock();

    /**
     * unlock account
     */
    public abstract void unlock();

    /**
     * incorrect pin provided for unlock operation
     */
    public abstract void incorrectUnlock();

    /**
     * suspend account
     */
    public abstract void suspend();

    /**
     * activate account
     */
    public abstract void activate();

    /**
     * close account
     */
    public abstract void close();
}
