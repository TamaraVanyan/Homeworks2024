package lightControl;

public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();

        RemoteControl remote = new RemoteControl(light);

        light.setIsOn(true);
        System.out.println(light.getStatus());
        System.out.println("____________________");

        light.setIsOn(true);

        light.toggle();
        System.out.println(remote.getLightStatus());
        System.out.println("_______________________");

        remote.changeBrightness(80);
        System.out.println(remote.getLightStatus());

        light.setIsOn(true);
        
        remote.resetLight();
        System.out.println(remote.getLightStatus());
    }
}
