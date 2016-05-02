package factory;

import actions.displaybalance.DisplayBalance;
import actions.displaymenu.DisplayMenu;
import actions.incorrectidmsg.IncorrectIdMsg;
import actions.incorrectlockmsg.IncorrectLockMsg;
import actions.incorrectpinmsg.IncorrectPinMsg;
import actions.incorrectunlockmsg.IncorrectUnlockMsg;
import actions.makedeposit.MakeDeposit;
import actions.makewithdrawal.MakeWithdrawal;
import actions.nofundsmsg.NoFundsMsg;
import actions.penalty.Penalty;
import actions.prompforpin.PromptForPin;
import actions.storedata.StoreData;
import actions.toomanyattemptsmsg.TooManyAttemptsMsg;
import datastore.DataStore;
import mdaevents.IEvents;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract factory for creating other concrete account factories.
 */
public abstract class AccountAbstractFactory {
    protected DataStore dataStore;

    protected IEvents events;

    protected DisplayBalance displayBalance;
    protected DisplayMenu displayMenu;
    protected IncorrectIdMsg incorrectIdMsg;
    protected IncorrectLockMsg incorrectLockMsg;
    protected IncorrectUnlockMsg incorrectUnlockMsg;
    protected IncorrectPinMsg incorrectPinMsg;
    protected MakeDeposit makeDeposit;
    protected MakeWithdrawal makeWithdrawal;
    protected NoFundsMsg noFundsMsg;
    protected Penalty penalty;
    protected PromptForPin promptForPin;
    protected StoreData storeData;
    protected TooManyAttemptsMsg tooManyAttemptsMsg;

    public abstract DataStore getDataStore();

    public abstract DisplayBalance getDisplayBalance();

    public abstract DisplayMenu getDisplayMenu();

    public abstract IncorrectIdMsg getIncorrectIdMsg();

    public abstract IncorrectLockMsg getIncorrectLockMsg();

    public abstract IncorrectUnlockMsg getIncorrectUnlockMsg();

    public abstract IncorrectPinMsg getIncorrectPinMsg();

    public abstract MakeDeposit getMakeDeposit();

    public abstract MakeWithdrawal getMakeWithdrawal();

    public abstract NoFundsMsg getNoFundsMsg();

    public abstract Penalty getPenalty();

    public abstract PromptForPin getPromptForPin();

    public abstract StoreData getStoreData();

    public abstract TooManyAttemptsMsg getTooManyAttemptsMsg();

    public abstract IEvents getEvents();
}
