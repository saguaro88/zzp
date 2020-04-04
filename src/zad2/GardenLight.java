package zad2;

public class GardenLight implements ILightControl {
    private ILightControl decorator;

    public GardenLight(ILightControl decorator){
        this.decorator = decorator;
    }
    @Override
    public void on() {
        System.out.println("Garden light on.");
        decorator.on();
    }

    @Override
    public void off() {
        System.out.println("Garden light off.");
        decorator.off();
    }

    public void setBrightness(int power){
        System.out.println("Garden light brightness set at " + power + ".");
    }
}
