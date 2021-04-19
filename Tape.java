public class Tape extends Book{
    private float playtime;
    private int price;


    public void setPlaytime(float playtime) {
        this.playtime = playtime;
    }

    public float getPlaytime() {
        return playtime;
    }

    public void setCPrice(int price) {
        this.price = price;
    }


    public int getCPrice() {
        return price;
    }

    public void displaymins() {
        System.out.println("Playing time in minutes is: "+playtime);
    }
}
