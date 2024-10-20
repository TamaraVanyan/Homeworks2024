package lightControl;

public class RemoteControl {
    SmartLight smartLight;

    public RemoteControl(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    public void resetLight() {
        smartLight.setIsOn(false);
        smartLight.setBrightness(60);
        smartLight.setColor("red");
        System.out.println("Light reset to default settings.");
    }

    public String getLightStatus() {
        return smartLight.getStatus();
    }

    public void changeBrightness(int newBrightness) {
        smartLight.setBrightness(newBrightness);
        System.out.println("Brightness changed to " + newBrightness);
    }
}