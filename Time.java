
public class Time {
    int seconds,hour,mins;

    Time(){
        seconds = seconds;
        hour = hour;
        mins = mins;
    }
    Time(int secs,int hrs, int min){
        seconds =secs;
        hour = hrs;
        mins = min;
    }

public void display(){
    if(seconds>60||mins>60||hour>24){
        System.out.println("Invalid value");
    }else {

        System.out.println("Time: " + hour + ":" + mins + ":" + seconds);
    }
}

}
