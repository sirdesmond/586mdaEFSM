package datastore;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete Implementation of the DB.
 */
public class DataStore2 extends DataStore{

    public DataStore2() {}

    public void setPin(int pin) {
        this.pin = Integer.toString(pin);
    }

    public void setId(int id) {
        this.id = Integer.toString(id);
    }

    public void setBal(int bal) {
        this.bal = Integer.toString(bal);
    }

    public void setDeposit_amt(int deposit_amt) {
        this.deposit_amt = (float) deposit_amt;
    }

    public void setWithdrawal_amt(int withdrawal_amt) {
        this.withdrawal_amt = (float) withdrawal_amt;
    }

    public void setTemp_pin(int pin) {
        this.temp_pin = Integer.toString(pin);
    }

    public void setTemp_id(int id) {
        this.temp_id = Integer.toString(id);
    }

    public void setTemp_bal(int bal) {
        this.temp_bal = Integer.toString(bal);
    }

    public void setTemp_deposit_amt(int deposit_amt) {
        this.temp_deposit_amt = (float) deposit_amt;
    }

    public void setTemp_withdrawal_amt(int withdrawal_amt) {
        this.temp_withdrawal_amt = (float) withdrawal_amt;
    }

}
