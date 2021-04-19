import java.util.Scanner;

public class Lab08Assignment1Runner extends Publication {
    public static void main(String[]args) {
        Book p1 = new Book();
        Scanner input = new Scanner(System.in);

        System.out.println("1.BOOK\n2.Cassette");
        System.out.println("Input: ");
        int n = input.nextInt();

        if(n==1) {


            System.out.println("Enter the title:");
            String title = input.next();
            p1.setTitle(title);
            System.out.println("Enter Price: ");
            float price = input.nextInt();
            p1.setPrice(price);
            System.out.println("Enter the pages in the book: ");
            int pages = input.nextInt();
            p1.setPages(pages);
            p1.display();
            p1.Display();

        }else if(n==2){
            Tape t = new Tape();
            System.out.println("Enter th price of cassette: ");
            int cprice = input.nextInt();
            t.setCPrice(cprice);
            System.out.println("Enter playing time: ");
            float pltime = input.nextFloat();
            t.setPlaytime(pltime);
            t.displaymins();
        }else{
            System.out.println("Error, Enter a valid argument");
        }

    }
}
