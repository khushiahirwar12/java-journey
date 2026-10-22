interface Camera {
    void takePhoto();

    default void record4KVideo() {
        System.out.println("Default: Recording video in 4K resolution at 60fps.");
    }

    static void showCameraSpecs() {
        System.out.println("Camera Utility: Optical image stabilization (OIS) supported.");
    }
}

interface MusicPlayer {
    void playAudio(String songTitle);

    default void enableDolbyAtmos() {
        System.out.println("Default: Dolby Atmos surround sound activated.");
    }
}

class SmartDevice implements Camera, MusicPlayer {
    private String user;

    SmartDevice(String user) {
        this.user = user;
    }

    @Override
    public void takePhoto() {
        System.out.println("Snapshot captured by: " + user);
    }

    @Override
    public void playAudio(String songTitle) {
        System.out.println("Playing track '" + songTitle + "' for " + user);
    }

    @Override
    public void record4KVideo() {
        System.out.println("Overridden: Custom HDR 4K recording initialized by " + user);
    }
}

public class InterfacesDeepDiveDemo {
    public static void main(String[] args) {
        Camera.showCameraSpecs();

        System.out.println();
        SmartDevice device = new SmartDevice("Khushi Ahirwar");

        device.takePhoto();
        device.record4KVideo();
        device.playAudio("Journey Symphony");
        device.enableDolbyAtmos();
    }
}
