public class MacBook extends Laptop {
    public MacBook(IOperatingSystem operatingSystem) {
        super(operatingSystem);
    }
    @Override
    public void turnOn() {
        System.out.println("MacBook is starting silently");
        operatingSystem.loadOS();
    }
}