import essentials.TaxCalculator;
import essentials.TaxCalculator2019;

/**
 * This is a course that I've taken to learn about the classic design patterns.
 * The instructor is called Mosh Hamedani.
 */
public class Main {
    public static void main(String[] args) {
//        User user = new User("Nitai");
//        user.sayHello();
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
