package day44_Inheritance.RemoteWebDriverTask;

public class EdgeDriver extends WebDriver {

    public EdgeDriver(String name, String version) {
        super("Edge", version);
    }


}
