package day44_Inheritance.RemoteWebDriverTask;

public class FireFoxDriver extends WebDriver {

    public FireFoxDriver(String name, String version) {
        super("Firefox", version);
    }
}
