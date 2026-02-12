//Date : 24/04/2025
//Create a class TV which implements TVremote interface from Q6
interface TVremote {
    void switchOn();
    void switchOff();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
    void mute();
    void unmute();
}

class TV implements TVremote {
    @Override
    public void switchOn() {
        System.out.println("TV is now ON.");
    }

    @Override
    public void switchOff() {
        System.out.println("TV is now OFF.");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume increased.");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume decreased.");
    }

    @Override
    public void channelUp() {
        System.out.println("Channel switched to the next one.");
    }

    @Override
    public void channelDown() {
        System.out.println("Channel switched to the previous one.");
    }

    @Override
    public void mute() {
        System.out.println("TV is muted.");
    }

    @Override
    public void unmute() {
        System.out.println("TV is unmuted.");
    }
}

public class C11Q7 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.switchOn();
        tv.volumeUp();
        tv.channelUp();
        tv.mute();
        tv.unmute();
        tv.channelDown();
        tv.volumeDown();
        tv.switchOff();
    }
}