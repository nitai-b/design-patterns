package patterns.template;

abstract public class Task {
    private AuditTrail auditTrail;

    /**
     * A default constructor.
     */
    public Task() {
        auditTrail = new AuditTrail();
    }

    /**
     *
     * @param auditTrail
     */
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    /**
     *
     */
    public void execute() {
        auditTrail.record();
        doExecute(); // hook method
    }

    /**
     * This is called a hook method. It's called in the execute() method above. It has its concrete implementations
     * in the child classes. And since it's protected, then it cannot be executed from outside. It can only be used
     * in the concrete classes.
     */
    protected abstract void doExecute();
}
