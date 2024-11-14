package callApp;

class DummyAppProMax extends DummyAppPro {
    private boolean screenSharing;

    public DummyAppProMax(String[] participants) {
        super(participants);
        this.screenSharing = false;
    }

    public void toggleScreenSharing() {
        if (isVideoCallEnabled()) {
            screenSharing = !screenSharing;
            if (screenSharing) {
                System.out.println("Screen sharing is now enabled.");
            } else {
                System.out.println("Screen sharing is now disabled.");
            }
        } else {
            System.out.println("Cannot share screen without an active video call.");
        }
    }

    public boolean isScreenSharing() {
        return screenSharing;
    }
}