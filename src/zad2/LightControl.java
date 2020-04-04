package zad2;

public class LightControl implements ILightControl {
    @Override
    public void on() {
        System.out.println("Light on.");
    }

    @Override
    public void off() {
        System.out.println("Light off.");
    }
}
