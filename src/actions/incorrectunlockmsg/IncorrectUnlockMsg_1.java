package actions.incorrectunlockmsg;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
 */
public class IncorrectUnlockMsg_1 extends IncorrectUnlockMsg{
    public IncorrectUnlockMsg_1(DataStore ds) {
        dataStore = ds;
    }

    @Override
    public void incorrectUnlockMsg() {
        System.out.println("Incorrect pin provided: "+ dataStore.getPin());
    }
}
