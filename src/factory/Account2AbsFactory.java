package factory;

import actions.displaybalance.DisplayBalance;
import actions.displaybalance.DisplayBalance_1;
import actions.displaymenu.DisplayMenu;
import actions.displaymenu.DisplayMenu_2;
import actions.incorrectidmsg.IncorrectIdMsg;
import actions.incorrectidmsg.IncorrectIdMsg_1;
import actions.incorrectlockmsg.IncorrectLockMsg;
import actions.incorrectlockmsg.IncorrectLockMsg_1;
import actions.incorrectpinmsg.IncorrectPinMsg;
import actions.incorrectpinmsg.IncorrectPinMsg_1;
import actions.incorrectunlockmsg.IncorrectUnlockMsg;
import actions.incorrectunlockmsg.IncorrectUnlockMsg_1;
import actions.makedeposit.MakeDeposit;
import actions.makedeposit.MakeDeposit_2;
import actions.makewithdrawal.MakeWithdrawal;
import actions.makewithdrawal.MakeWithdrawal_2;
import actions.nofundsmsg.NoFundsMsg;
import actions.nofundsmsg.NoFundsMsg_1;
import actions.penalty.Penalty;
import actions.penalty.Penalty_1;
import actions.prompforpin.PromptForPin;
import actions.prompforpin.PromptForPin_1;
import actions.storedata.StoreData;
import actions.storedata.StoreData_1;
import actions.toomanyattemptsmsg.TooManyAttemptsMsg;
import actions.toomanyattemptsmsg.TooManyAttemptsMsg_1;
import datastore.DataStore;
import datastore.DataStore2;
import mdaevents.EventsImpl;
import mdaevents.IEvents;
import state.AccountContext;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete Factory for creating Account 1 internals.
 */
public class Account2AbsFactory extends AccountAbstractFactory{

    public Account2AbsFactory() {
        dataStore = new DataStore2();
        displayBalance = new DisplayBalance_1(dataStore);
        displayMenu = new DisplayMenu_2();
        incorrectIdMsg = new IncorrectIdMsg_1(dataStore);
        incorrectLockMsg = new IncorrectLockMsg_1(dataStore);
        incorrectPinMsg = new IncorrectPinMsg_1(dataStore);
        incorrectUnlockMsg = new IncorrectUnlockMsg_1(dataStore);
        makeDeposit = new MakeDeposit_2(dataStore);
        makeWithdrawal = new MakeWithdrawal_2(dataStore);
        noFundsMsg = new NoFundsMsg_1();
        penalty = new Penalty_1(dataStore);
        promptForPin = new PromptForPin_1();
        storeData = new StoreData_1(dataStore);
        tooManyAttemptsMsg = new TooManyAttemptsMsg_1();
        events = new EventsImpl(new AccountContext(dataStore,this));

    }



    @Override
    public DataStore getDataStore() {
        return this.dataStore;
    }

    @Override
    public DisplayBalance getDisplayBalance() {
        return this.displayBalance;
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return this.displayMenu;
    }

    @Override
    public IncorrectIdMsg getIncorrectIdMsg() {
        return this.incorrectIdMsg;
    }

    @Override
    public IncorrectLockMsg getIncorrectLockMsg() {
        return this.incorrectLockMsg;
    }

    @Override
    public IncorrectUnlockMsg getIncorrectUnlockMsg() {
        return this.incorrectUnlockMsg;
    }

    @Override
    public IncorrectPinMsg getIncorrectPinMsg() {
        return this.incorrectPinMsg;
    }

    @Override
    public MakeDeposit getMakeDeposit() {
        return this.makeDeposit;
    }

    @Override
    public MakeWithdrawal getMakeWithdrawal() {
        return this.makeWithdrawal;
    }

    @Override
    public NoFundsMsg getNoFundsMsg() {
        return this.noFundsMsg;
    }

    @Override
    public Penalty getPenalty() {
        return this.penalty;
    }

    @Override
    public PromptForPin getPromptForPin() {
        return this.promptForPin;
    }

    @Override
    public StoreData getStoreData() {
        return this.storeData;
    }

    @Override
    public TooManyAttemptsMsg getTooManyAttemptsMsg() {
        return this.tooManyAttemptsMsg;
    }

    @Override
    public IEvents getEvents() {
        return events;
    }
}
