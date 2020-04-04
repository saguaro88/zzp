package zad2;

public class DoorControl implements IDoorControl {

    @Override
    public void open() {
        System.out.println("Door open.");
    }

    @Override
    public void close() {
        System.out.println("Door close.");
    }

    @Override
    public void lock() {
        System.out.println("Door lock.");
    }

    @Override
    public void unlock() {
        System.out.println("Door unlock.");
    }
}
