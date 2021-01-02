package replit;

public class Db {

    private String data;
    private int yint;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public void insertData(){
        this.data = getData();
        this.yint = getYint();
    }
}
