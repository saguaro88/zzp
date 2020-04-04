package zad2;


public class Main {
    public static void main(String[] args) {
       Api api = new Api();
       api.enterHome();
       api.leaveHome();

       GateLight gateLight = new GateLight(new LightControl());
       gateLight.on();
    }
}
