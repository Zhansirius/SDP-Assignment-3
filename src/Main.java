public class Main {
    public static void main(String[] args) {
        IOperatingSystem windows = new WindowsOS();
        IOperatingSystem mac = new MacOS();

        Laptop myGamingLaptop = new GamingLaptop(windows);
        myGamingLaptop.turnOn();

        myGamingLaptop.setOperatingSystem(mac);
        myGamingLaptop.turnOn();

        Laptop myMacBook = new MacBook(mac);
        myMacBook.turnOn();

        myMacBook.setOperatingSystem(windows);
        myMacBook.turnOn();
    }
}