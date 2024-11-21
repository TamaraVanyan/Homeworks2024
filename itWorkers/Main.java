package itWorkers;

public class Main {
    public static void main(String[] args) {
        ITWorker[] itWorkers = {
                new ProjectManager(),
                new FrontendDeveloper(),
                new BackendDeveloper(),
                new FullStackDeveloper(),
                new TestAutomationEngineer()
        };

        Developer[] developers = {
                new FrontendDeveloper(),
                new BackendDeveloper(),
                new FullStackDeveloper(),
                new TestAutomationEngineer()
        };

        System.out.println("IT Workers:");
        for (int i = 0; i < itWorkers.length; i++) {
            itWorkers[i].doesWork();
        }

        System.out.println("\nDevelopers' Health Check:");
        for (int i = 0; i < developers.length; i++) {
            boolean healthCheckResult = developers[i].doHealthCheck();
            System.out.println(developers[i].getClass().getSimpleName() + " health check: " + healthCheckResult);
        }
    }
}