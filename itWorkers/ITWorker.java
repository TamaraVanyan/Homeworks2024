package itWorkers;

public abstract class ITWorker {
    protected String[] skills;
    protected String[] ides;

    public abstract String[] getSkills();
    public abstract String[] usesIDE();
    public abstract void doesWork();
}
