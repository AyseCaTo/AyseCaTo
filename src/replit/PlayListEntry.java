package replit;

public class PlayListEntry {

    public String title = "", artist = "";
    public int playCount = 0;

    public void SetInfo(String title, String artist, int playCount){
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    public void getInfo(){
        System.out.println("Title: " + title + " \nArtist: " + artist + " Play Count: " + playCount);
    }
}
