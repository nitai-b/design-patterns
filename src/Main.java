import essentials.TaxCalculator;
import essentials.TaxCalculator2019;
import essentials.UIControl;
import patterns.composite.Group;
import patterns.composite.Shape;
import patterns.template.TransferMoneyTask;

/**
 * This is a course that I've taken to learn about the classic design patterns.
 * The instructor is called Mosh Hamedani.
 */
public class Main {

    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();


//        var group1 = new Group();
//        group1.add(new Shape());
//        group1.add(new Shape());
//
//        var group2 = new Group();
//        group2.add(new Shape());
//        group2.add(new Shape());
//
//        var group = new Group();
//        group.add(group1);
//
//        group.render();
//        (new Shape()).render();
//        (new Group()).render();

//        var imageStorage = new ImageStorage();
//        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());

//        var history = new BrowserHistory();
//        history.push("a");
//        history.push("b");
//        history.push("c");
//
//        Iterator<String> iterator = history.createIterator();
//        while (iterator.hasNext()) {
//            var url = iterator.current();
//            System.out.println(url);
//            iterator.next();
//        }

//        Canvas canvas = new Canvas();

//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();

//        var editor = new Editor();
//        var history = new History();

//        editor.setContent("a");
//        history.push(editor.createState());

//        editor.setContent("b");
//        history.push(editor.createState());

//        editor.setContent("c");
//        editor.restore(history.pop());

//        System.out.println(editor.getContent());
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
//        var textbox = new TextBox();
//        var selectbox = new SelectBox();
//        textbox.enable();

        // This is the concept of polymorphism
//        textbox.draw();
//        selectbox.draw();
//        System.out.println("\n");
        // or you can do something like this
//        drawUIControl(new TextBox());
//        drawUIControl(new SelectBox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    /**
     * This method takes in an abstract class as the parameter, and from this it can draw different elements
     * See main function for the client code (the code that uses these polymorphic classes).
     */
    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
