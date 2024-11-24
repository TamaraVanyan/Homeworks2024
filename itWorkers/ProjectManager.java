package itWorkers;

public class ProjectManager extends ITWorker{
    public ProjectManager() {
        skills = new String[]{"Management", "Planning", "Communication"};
        ides = new String[0];
    }

    @Override
    public String[] getSkills() {
        return skills;
    }

    @Override
    public String[] usesIDE() {
        return ides;
    }

    @Override
    public void doesWork() {
        System.out.println("Project Manager handles manage project");
    }
}
