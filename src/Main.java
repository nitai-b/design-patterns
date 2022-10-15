import essentials.*;

/**
 * This is a course that I've taken to learn about the classic design patterns.
 * The instructor is called Mosh Hamedani.
 */
public class Main {
    public static void main(String[] args) {
//        User user = new User("Nitai");
//        user.sayHello();
//        TaxCalculator calculator = getCalculator();
//        calculator.calculateTax();

//        var account = new Account();
//        account.deposit(10);
//        account.withdraw(2);
//        System.out.println(account.getBalance());

//        MailService service = new MailService();
//        service.sendEmail();

        // TextBox
        // There's more about inheritance in the other Java Course by Mosh Hamedani
        var textbox = new TextBox();
        textbox.enable();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
