public class GamingLaptop extends Laptop {

    public GamingLaptop(IOperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println("Gaming Laptop is booting up with RGB lights!");
        operatingSystem.loadOS();
    }
}