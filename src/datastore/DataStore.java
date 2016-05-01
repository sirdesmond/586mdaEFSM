package datastore;

/**
 * Created by kofikyei on 4/30/16.
 */
public abstract class DataStore {

    protected String pin;
    protected String id;
    protected String bal;
    protected float deposit_amt;
    protected float withdrawal_amt;


    protected String temp_pin;
    protected String temp_id;
    protected String temp_bal;
    protected float temp_deposit_amt;
    protected float temp_withdrawal_amt;



    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBal() {
        return bal;
    }

    public void setBal(String bal) {
        this.bal = bal;
    }

    public float getDeposit_amt() {
        return deposit_amt;
    }

    public void setDeposit_amt(float deposit_amt) {
        this.deposit_amt = deposit_amt;
    }

    public float getWithdrawal_amt() {
        return withdrawal_amt;
    }

    public void setWithdrawal_amt(float withdrawal_amt) {
        this.withdrawal_amt = withdrawal_amt;
    }


    public String getTemp_pin() {
        return temp_pin;
    }

    public void setTemp_pin(String temp_pin) {
        this.temp_pin = temp_pin;
    }

    public String getTemp_id() {
        return temp_id;
    }

    public void setTemp_id(String temp_id) {
        this.temp_id = temp_id;
    }

    public String getTemp_bal() {
        return temp_bal;
    }

    public void setTemp_bal(String temp_bal) {
        this.temp_bal = temp_bal;
    }

    public float getTemp_deposit_amt() {
        return temp_deposit_amt;
    }

    public void setTemp_deposit_amt(float temp_deposit_amt) {
        this.temp_deposit_amt = temp_deposit_amt;
    }

    public float getTemp_withdrawal_amt() {
        return temp_withdrawal_amt;
    }

    public void setTemp_withdrawal_amt(float temp_withdrawal_amt) {
        this.temp_withdrawal_amt = temp_withdrawal_amt;
    }
}
