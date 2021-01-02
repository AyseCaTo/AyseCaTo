package day44_Inheritance.RemoteWebDriverTask;

public class ChromeDriver extends WebDriver {

    public ChromeDriver() {
        super("Chrome", "V84.014");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening " + URL + " from the chrome browser");
    }

    @Override
    public void close(String URL) {
        super.close(URL);
    }

    @Override
    public void maximize(String URL) {
        super.maximize(URL);
    }
}
