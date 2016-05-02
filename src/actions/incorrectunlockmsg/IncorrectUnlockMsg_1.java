package actions.incorrectunlockmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Abstract class for throwing IncorrectUnlockMsg warning.
 */
public class IncorrectUnlockMsg_1 extends IncorrectUnlockMsg{
    public IncorrectUnlockMsg_1(DataStore ds) {
        dataStore = ds;
    }

    @Override
    public void incorrectUnlockMsg() {
        System.out.println("Incorrect pin provided: "+ dataStore.getTemp_pin());
    }
}
