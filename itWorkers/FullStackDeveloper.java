package itWorkers;

public class FullStackDeveloper extends Developer{
    private final boolean frontendHealthStatus = true;
    private final boolean backendHealthStatus = false;

    public FullStackDeveloper() {
        skills = new String[]{"Java", "Spring Boot", "HTML", "CSS", "JavaScript", "React"};
        ides = new String[]{"IntelliJ IDEA", "Visual Studio Code"};
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
        System.out.println("Full Stack Developer works on both frontend and backend systems.");
    }

    @Override
    public boolean doHealthCheck() {
        System.out.println("Calling to API " + baseUrl);
        System.out.println("Frontend health check status: " + frontendHealthStatus);

        System.out.println("Calling to API " + baseUrl);
        System.out.println("Backend health check status: " + backendHealthStatus);

        return frontendHealthStatus && backendHealthStatus;
    }
}
