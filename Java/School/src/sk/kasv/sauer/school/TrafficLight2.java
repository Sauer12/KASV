package sk.kasv.sauer.school;

public class TrafficLight2 implements TrafficLightMethods {
    protected boolean red;
    protected boolean green;

    public TrafficLight2() {
        red = true;
        green = false;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public boolean isGreen() {
        return green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    @Override
    public void switchRed() {
        red=true;
        green=false;
    }

    @Override
    public void switchGreen() {
        red=false;
        green=true;
    }
}
