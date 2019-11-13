package lesson2;

public class Lamp {
    private boolean state;

    private int brightness;

    public void switchOn()
    {
        state = true;
    }

    @Override
    public String
    toString() {
        return "Lamp{" +
                "state=" + state +
                ", brightness=" + brightness +
                '}';
    }

    public void switchOff()
    {
        state = false;
    }
    public void getInfo()
    {
        System.out.println("Brightness = " + brightness);
        String stateValue = (state)? "ON" : "OFF";
        System.out.println("Lamp is " + stateValue);
    }
    public void setBrightness(int value)
    {
        brightness = value;
    }

}
