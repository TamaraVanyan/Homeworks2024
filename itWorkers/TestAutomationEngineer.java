package itWorkers;

public class TestAutomationEngineer extends Developer{
    private final boolean testCasesAvailable = true;

    public TestAutomationEngineer() {
        skills = new String[]{"Test Automation", "Selenium", "JUnit"};
        ides = new String[]{"IntelliJ IDEA"};
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
        System.out.println("Test Automation Engineer writes and executes automated test cases.");
    }

    @Override
    public boolean doHealthCheck() {
        System.out.println("Checking for test cases availability.");
        System.out.println("Test cases available: " + testCasesAvailable);
        return testCasesAvailable;
    }
}