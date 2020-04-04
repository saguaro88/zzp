package zad2;

public class Api {
    private ILightControl lightControl = new LightControl();
    private IHeatControl heatControl = new HeatControl();
    private IDoorControl doorControl = new DoorControl();

    public void leaveHome(){
        System.out.println("leaveHome()");
        lightControl.off();
        heatControl.off();
        doorControl.close();
        doorControl.lock();
    }
    public void enterHome(){
        System.out.println("enterHome()");
        lightControl.on();
        heatControl.on();
        heatControl.setTemp(22);
        doorControl.unlock();
        doorControl.open();
    }
}
