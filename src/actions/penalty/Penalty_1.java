package actions.penalty;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * concrete class for assigning account 1 penalty.
 */
public class Penalty_1 extends Penalty{
    public Penalty_1(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void penalty() {
        dataStore.setBal(String.valueOf(Float.parseFloat(dataStore.getBal()) - 20));
        System.out.println("overdraft fee - $20");
    }
}
