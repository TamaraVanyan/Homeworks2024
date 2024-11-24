package itWorkers;

public class BackendDeveloper extends Developer{
    private final boolean backendHealthStatus = true;

    public BackendDeveloper() {
        skills = new String[]{"Java", "Spring Boot", "SQL"};
        ides = new String[]{"IntelliJ IDEA", "Git"};
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
        System.out.println("Backend Developer builds server-side logic and APIs.");
    }

    @Override
    public boolean doHealthCheck() {
        System.out.println("Calling to API " + baseUrl + " healthCheck");
        System.out.println("Backend health check status: " + backendHealthStatus);
        return backendHealthStatus;
    }
}