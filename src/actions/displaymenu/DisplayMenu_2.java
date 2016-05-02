package actions.displaymenu;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class for displaying menu for account 2
 */
public class DisplayMenu_2 extends DisplayMenu{
    @Override
    public void displayMenu() {
        System.out.println("*************************************************");
        System.out.println("Select operation:");
        System.out.println("\t 0. OPEN (int pin, int id, int amt)");
        System.out.println("\t 1. PIN (string x)");
        System.out.println("\t 2. DEPOSIT (int d)");
        System.out.println("\t 3. WITHDRAW (int w)");
        System.out.println("\t 4. BALANCE ()");
        System.out.println("\t 5. LOGIN(int y)");
        System.out.println("\t 6. LOGOUT()");
        System.out.println("\t 7. suspend()");
        System.out.println("\t 8. activate()");
        System.out.println("\t 9. close()");
        System.out.println("\t 10. Quit the demo program");
        System.out.println("*************************************************");
    }
}
