package itWorkers;

public class FrontendDeveloper extends Developer{
    private final boolean frontendHealthStatus = true;

    public FrontendDeveloper() {
        skills = new String[]{"HTML", "CSS", "JavaScript", "React"};
        ides = new String[]{"Visual Studio Code", "WP"};
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
        System.out.println("Frontend Developer develops user interfaces.");
    }

    @Override
    public boolean doHealthCheck() {
        System.out.println("Calling to API " + baseUrl + "healthCheck");
        System.out.println("Frontend health check status: " + frontendHealthStatus);
        return frontendHealthStatus;
    }
}
