package mdaevents;

/**
 * Created by kofikyei on 4/30/16.
 */
public interface IEvents {
    /**
     * opens an account
     */
    public void open();

    /**
     * login into account
     */
    public void login();

    /**
     * incorrect login
     */
    public void incorrectLogin();

    /**
     * incorrect pin given
     * @param max
     */
    public void incorrectPin(int max);

    /**
     * correct pin but balance below minimum
     */
    public void correctPinBelowMin();

    /**correct pin and balance above minimum
     *
     */
    public void correctPinAboveMin();

    /**
     * deposit into account
     */
    public void deposit();

    /**
     * balance below minimum
     */
    public void belowMinBalance();

    /**
     * balance above minimum
     */
    public void aboveMinBalance();

    /**
     * logout
     */
    public void logout();

    /**
     * check balance
     */
    public void balance();

    /**
     * withdraw from account
     */
    public void withdraw();

    /**
     * balance after withdrawal below minimum
     */
    public void withdrawBelowMinBalance();

    /**
     * no funds in account
     */
    public void noFunds();

    /**
     * lock account
     */
    public void lock();

    /**
     * incorrect pin provided for lock operation
     */
    public void incorrectLock();

    /**
     * unlock account
     */
    public void unlock();

    /**
     * incorrect pin provided for unlock operation
     */
    public void incorrectUnlock();

    /**
     * suspend account
     */
    public void suspend();

    /**
     * activate account
     */
    public void activate();

    /**
     * close account
     */
    public void close();
}
