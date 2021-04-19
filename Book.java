

public class Book extends Publication{
    private int pages;


    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void Display() {
        System.out.println("Pages in the book are: "+pages);
    }
}
