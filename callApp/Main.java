package callApp;

public class Main {
    public static void main(String[] args) {
        String[] basicCallParticipants = {"Valodik Galstyan", "Yurik Dzyadzya"};
        DummyCall basicCall = new DummyCall(basicCallParticipants);
        basicCall.makeCall();
        basicCall.endCall();

        System.out.println("__________________________________________________________________");

        String[] proCallParticipants = {"Vazgen Galstyan", "Filaret Filaretyan", "Irina Pahipahi", "Pabam Pabamyan"};
        DummyAppPro proCall = new DummyAppPro(proCallParticipants);
        proCall.makeCall();
        proCall.toggleVideoCall();
        proCall.toggleCamera();
        proCall.endCall();

        System.out.println("______________________________________________________________________");

        String[] maxCallParticipants = {"Vazgen Galstyan",  "Valodik Galstyan", "Yurik Dzyadzya",
                "Filaret Filaretyan", "Irina Pahipahi", "Pabam Pabamyan" };
        DummyAppProMax maxCall = new DummyAppProMax(maxCallParticipants);
        maxCall.makeCall();
        maxCall.toggleVideoCall();
        maxCall.toggleScreenSharing();
        maxCall.toggleScreenSharing();
        maxCall.endCall();
    }
}