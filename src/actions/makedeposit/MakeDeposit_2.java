package actions.makedeposit;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for making account 2 deposit.
 */
public class MakeDeposit_2 extends MakeDeposit{

    public MakeDeposit_2(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @Override
    public void makeDeposit() {
        dataStore.setBal(String.valueOf(Float.parseFloat(dataStore.getBal()) +
                dataStore.getTemp_deposit_amt()));
        System.out.println("$"+dataStore.getTemp_deposit_amt() + " deposited");
    }
}
