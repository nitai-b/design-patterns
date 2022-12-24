import essentials.TaxCalculator;
import essentials.TaxCalculator2019;
import essentials.UIControl;
import patterns.command.AddCustomerCommand;
import patterns.command.CustomerService;
import patterns.command.fx.Button;
import patterns.composite.Group;
import patterns.composite.Shape;
import patterns.template.TransferMoneyTask;

/**
 * This is a course that I've taken to learn about the classic design patterns.
 * The instructor is called Mosh Hamedani.
 */
public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
    }
}
