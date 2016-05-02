package actions.toomanyattemptsmsg;

/**
 * Created by APPIAH-KUBI DESMOND on 4/30/16.
 * Concrete class to throw warning on too many attempts.
 */
public class TooManyAttemptsMsg_1 extends TooManyAttemptsMsg{
    @Override
    public void tooManyAttemptsMsg() {
        System.out.println("You have exceeded your attempts for today!");
        System.out.println("Try again later...Bye!!");
        System.exit(1);
    }
}
