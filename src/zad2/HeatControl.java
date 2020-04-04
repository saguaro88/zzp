package zad2;

public class HeatControl implements IHeatControl {
    @Override
    public void on() {
        System.out.println("Heating on.");
    }

    @Override
    public void off() {
        System.out.println("Heating off.");
    }

    @Override
    public void setTemp(int temp) {
        System.out.println("Temperature set at " + temp+ ".");
    }
}
