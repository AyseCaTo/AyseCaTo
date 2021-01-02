package day44_Inheritance.RemoteWebDriverTask;

public class WebDriver {

    public String name, version;

    public WebDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public void get(String URL){
        System.out.println("opening the default Remote driver");
    }

    public void close(String URL){
        System.out.println("closing the default Remote driver");
    }

    public void maximize(String URL){
        System.out.println("maximize the default Remote driver");
    }

    @Override
    public String toString() {
        return "RemoteWebDriver{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
