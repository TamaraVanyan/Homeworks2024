package callApp;

class DummyAppPro extends DummyCall {
    private boolean videoCallEnabled;
    private boolean cameraOn;

    public DummyAppPro(String[] participants) {
        super(participants);
        if (participants.length <= 10) {
            this.videoCallEnabled = false;
            this.cameraOn = false;
            System.out.println("Pro call created successfully with " + participants.length + " participants");
        } else {
            System.out.println("Pro call should be up to 10 participants");
        }
    }

    public void toggleVideoCall() {
        videoCallEnabled = !videoCallEnabled;
        if (videoCallEnabled) {
            System.out.println("Video call is now enabled.");
        } else {
            System.out.println("Video call is now disabled.");
        }
    }

    public void toggleCamera() {
        cameraOn = !cameraOn;
        if (cameraOn) {
            System.out.println("Camera is now on.");
        } else {
            System.out.println("Camera is now off.");
        }
    }

    public boolean isCameraOn() {
        return cameraOn;
    }

    public boolean isVideoCallEnabled() {
        return videoCallEnabled;
    }
}