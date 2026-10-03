public abstract class Laptop {
    protected IOperatingSystem operatingSystem;
    public Laptop(IOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void setOperatingSystem(IOperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public abstract void turnOn();
}