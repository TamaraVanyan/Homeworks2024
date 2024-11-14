package callApp;

class DummyCall {
    private String[] participants;
    private boolean callActive;
    private int callDuration;

    public DummyCall(String[] participants) {
        if (participants.length == 2) {
            this.participants = participants;
            this.callActive = true;
            this.callDuration = 0;
            System.out.println("Call created successfully with " + participants.length + " participants.");
        } else {
            System.out.println("Basic call requires exactly 2 participants.");
            this.participants = new String[0];
            this.callActive = false;
        }
    }

    public void makeCall() {
        if (!callActive) {
            System.out.println("Starting a new call.");
            callActive = true;
        } else {
            System.out.println("Call is already active.");
        }
    }

    public void acceptCall() {
        System.out.println("Call accepted.");
        callActive = true;
    }

    public void endCall() {
        System.out.println("Call ended.");
        callActive = false;
    }

    public int getCallDuration() {
        return callDuration;
    }

    protected void increaseCallDuration(int seconds) {
        if (callActive) {
            callDuration += seconds;
        }
    }
}