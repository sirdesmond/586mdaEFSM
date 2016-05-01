package actions.makedeposit;

import datastore.DataStore;

/**
 * Created by kofikyei on 4/30/16.
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
