package actions.incorrectlockmsg;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for throwing IncorrectLockMsg warning.
 */
public class IncorrectLockMsg_1 extends IncorrectLockMsg{

    public IncorrectLockMsg_1(DataStore ds) {
        dataStore = ds;
    }

    @Override
    public void incorrectLockMsg() {
        System.out.println("Incorrect pin provided: "+ dataStore.getPin());
    }
}
