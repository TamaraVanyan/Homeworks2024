package lightControl;

public class SmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    public SmartLight() {
        this.isOn = false;
        this.brightness = 67;
        this.color = "yellow";
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        if (this.isOn == on) {
            if (on) {
                System.out.println("Light already on.");
            } else {
                System.out.println("Light already off.");
            }
        } else {
            this.isOn = on;
            if (on) {
                System.out.println("Light turn on.");
            } else {
                System.out.println("Light turn off.");
            }
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Brightness should be between 0 and 100.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        this.isOn = !this.isOn;
    }

    public String getStatus() {
        return "Light status - On: " + isOn + ", Brightness: " + brightness + ", Color: " + color;
    }
}