package replit;

public class ParkingMeter {

    public int timeLeft = 0, maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int n){
        if (maxTime>timeLeft){
            if (n==25) timeLeft+=30;
            return true;
        }else timeLeft+=0;
        return false;
    }


    public void tick(){
        if (timeLeft>1) timeLeft-=1;
    }

    public boolean isExpired(){
        if (timeLeft==0) return true;
        else return false;
    }
}
