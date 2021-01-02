package day44_Inheritance.RemoteWebDriverTask;

public class SafariDriver extends WebDriver {

    public SafariDriver(String name, String version) {
        super("Safari", version);
    }
}
