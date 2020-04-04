package zad2;

public class HomeCinemaLight implements ILightControl {
    ILightControl decorator;

    public HomeCinemaLight(ILightControl decorator){
        this.decorator = decorator;
    }
    @Override
    public void on() {
        System.out.println("Home cinema light on.");
    }

    @Override
    public void off() {
        System.out.println("Home cinema light off.");
    }
    public void setColor(String color){
        System.out.println("Home cinema light color set at "+ color + ".");
    }
    public void onDynamicLight(){
        System.out.println("Home cinema dynamic light on.");
    }
    public void offDynamicLight(){
        System.out.println("Home cinema dynamic light off.");
    }
}
