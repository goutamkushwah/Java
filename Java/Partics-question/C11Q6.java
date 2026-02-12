//Date : 24/04/2025
//Create an interface TVremote and use it to inherit another interface smart TVremote 
interface TVremote {
    void switchOn();
    void switchOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
    void mute();
    void unmute();
    void play();
    void pause();
    void stop();
}

class TV implements TVremote {
    public void switchOn() {
        System.out.println("Switching on the TV...");
    }

    public void switchOff() {
        System.out.println("Switching off the TV...");
    }

    public void volumeUp() {
        System.out.println("Increasing volume...");
    }

    public void volumeDown() {
        System.out.println("Decreasing volume...");
    }

    public void channelUp() {
        System.out.println("Changing to next channel...");
    }

    public void channelDown() {
        System.out.println("Changing to previous channel...");
    }

    public void mute() {
        System.out.println("Muting the TV...");
    }

    public void unmute() {
        System.out.println("Unmuting the TV...");
    }

    public void play() {
        System.out.println("Playing the TV...");
    }

    public void pause() {
        System.out.println("Pausing the TV...");
    }

    public void stop() {
        System.out.println("Stopping the TV...");
    }
}

public class C11Q6 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.switchOn();
        tv.volumeUp();
        tv.channelUp();
        tv.mute();
        tv.play();
        tv.pause();
        tv.stop();
        tv.switchOff();
        tv.volumeDown();
        tv.channelDown();
        tv.unmute();
    }
}