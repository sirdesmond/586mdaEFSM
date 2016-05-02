package actions.makedeposit;

import datastore.DataStore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for making account 1 deposit.
 */
public class MakeDeposit_1 extends MakeDeposit{

    public MakeDeposit_1(DataStore dataStore) {
        this.dataStore =  dataStore;
    }

    @Override
    public void makeDeposit() {
        dataStore.setBal(String.valueOf(Float.parseFloat(dataStore.getBal())
        + dataStore.getTemp_deposit_amt()));
        System.out.println("$"+dataStore.getTemp_deposit_amt() + " deposited");
    }
}
