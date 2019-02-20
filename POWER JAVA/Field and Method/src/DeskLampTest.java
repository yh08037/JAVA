
class DeskLamp {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String toString() {
        return "현재 상태는 " + (isOn ? "켜짐" : "꺼짐");
    }
}

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp lamp = new DeskLamp();
        lamp.turnOn();
        System.out.println(lamp);
        lamp.turnOff();
        System.out.println(lamp);
    }
}
