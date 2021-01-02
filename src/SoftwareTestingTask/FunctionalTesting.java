package SoftwareTestingTask;

public class FunctionalTesting {

    public String nameOfTest, doneBy, environment;

    public FunctionalTesting(String nameOfTest, String doneBy, String environment) {
        this.nameOfTest = nameOfTest;
        this.doneBy = doneBy;
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "FunctionalTesting{" +
                "nameOfTest='" + nameOfTest + '\'' +
                ", doneBy='" + doneBy + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }
}
