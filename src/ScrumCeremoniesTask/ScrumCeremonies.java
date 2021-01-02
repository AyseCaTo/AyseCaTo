package ScrumCeremoniesTask;

public class ScrumCeremonies {

    private String nameOfCeremony, host;

    public ScrumCeremonies(String nameOfCeremony, String host) {
        this.nameOfCeremony = nameOfCeremony;
        this.host = host;
    }

    public String agenda(){
        return "";
    }

    public String duration(){
        return "";
    }

    public String meetingTime(){
        return "";
    }

    @Override
    public String toString() {
        return "ScrumCeremonies{" +
                "nameOfCeremony='" + nameOfCeremony + '\'' +
                ", host='" + host + '\'' +
                '}';
    }
}
