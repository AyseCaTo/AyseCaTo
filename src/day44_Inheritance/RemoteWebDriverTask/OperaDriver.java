package day44_Inheritance.RemoteWebDriverTask;

public class OperaDriver extends WebDriver {

    public OperaDriver(String name, String version) {
        super("Opera", version);
    }
}
