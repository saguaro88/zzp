package zad2;

public class GateLight implements ILightControl {

    ILightControl decorator;

    public GateLight(ILightControl decorator){
        this.decorator = decorator;
    }

    @Override
    public void on() {
        System.out.println("Gate light on.");
    }

    @Override
    public void off() {
        System.out.println("Gate light off.");
    }
}
