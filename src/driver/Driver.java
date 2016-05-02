package driver;

import client.Account;
import client.Account1;
import client.Account2;

import java.util.Scanner;

/**
 * Created by APPIAH-KUBI DESMOND on 5/1/16.
 */
public class Driver {
    static Scanner sc;
    static Account account;
    static int choice;
    static String option;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        while (true){
            System.out.println("Select Account: 1 or 2?");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Going into Account 1...");
                    account = new Account1();
                    drive1((Account1) account);
                    break;
                case 2:
                    System.out.println("Going into Account 2...");
                    account = new Account2();
                    drive2((Account2) account);
                    break;
                default:
                    System.out.println("Unsupported input..try again");
                    break;

            }
        }
    }

    /**
     * This is the actual driver for account 1
     * @param account
     */
    private static void drive1(Account1 account) {
        System.out.println("Select operation from menu:");
        account.getFactory().getDisplayMenu().displayMenu();
        String pin;
        String id;
        String bal;
        Float amt;
        while (true){
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    //open
                    System.out.println("Enter pin");
                    pin = sc.next();
                    System.out.println("Enter id");
                    id = sc.next();
                    System.out.println("Enter balance");
                    bal = sc.next();
                    account.open(pin,id,bal);
                    break;
                case 1:
                    //pin
                    System.out.println("Enter pin");
                    pin = sc.next();
                    account.pin(pin);
                    break;
                case 2:
                    //deposit
                    System.out.println("Enter amount");
                    amt = sc.nextFloat();
                    account.deposit(amt);
                    break;
                case 3:
                    //withdraw
                    System.out.println("Enter amount");
                    amt = sc.nextFloat();
                    account.withdraw(amt);
                    break;
                case 4:
                    //balance
                    account.balance();
                    break;
                case 5:
                    //login
                    System.out.println("Enter id");
                    id = sc.next();
                    account.login(id);
                    break;
                case 6:
                    //logout
                    account.logout();
                    break;
                case 7:
                    //lock
                    System.out.println("Enter pin");
                    pin = sc.next();
                    account.lock(pin);
                    break;
                case 8:
                    //unlock
                    System.out.println("Enter pin");
                    pin = sc.next();
                    account.unlock(pin);
                    break;
                case 9:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Unsupported input..try again");
                    break;
            }
        }
    }

    /**
     * This is what actually drives account 2
     * @param account
     */
    private static void drive2(Account2 account) {
        System.out.println("Select operation from menu:");
        account.getFactory().getDisplayMenu().displayMenu();

        int pin;
        int id;
        int bal;
        int amt;
        while (true){
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    //OPEN
                    System.out.println("Enter pin");
                    pin = sc.nextInt();
                    System.out.println("Enter id");
                    id = sc.nextInt();
                    System.out.println("Enter balance");
                    bal = sc.nextInt();
                    account.OPEN(pin,id,bal);
                    break;
                case 1:
                    //PIN
                    System.out.println("Enter PIN");
                    pin = sc.nextInt();
                    account.PIN(pin);
                    break;
                case 2:
                    //DEPOSIT
                    System.out.println("Enter amount");
                    amt = sc.nextInt();
                    account.DEPOSIT(amt);
                    break;
                case 3:
                    //WITHDRAW
                    System.out.println("Enter amount");
                    amt = sc.nextInt();
                    account.WITHDRAW(amt);
                    break;
                case 4:
                    //BALANCE
                    account.BALANCE();
                    break;
                case 5:
                    //LOGIN
                    System.out.println("Enter id");
                    id = sc.nextInt();
                    account.LOGIN(id);
                    break;
                case 6:
                    account.LOGOUT();
                    //LOGOUT
                    break;
                case 7:
                    account.suspend();
                    //suspend
                    break;
                case 8:
                    account.activate();
                    //activate
                    break;
                case 9:
                    //close
                    account.close();
                    break;
                case 10:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Unsupported input...try again");
                    break;
            }
        }
    }
}
