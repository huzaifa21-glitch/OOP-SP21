
public class Publication {

    private String title;
    private float price;

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
}
