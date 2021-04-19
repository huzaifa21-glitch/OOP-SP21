import java.util.Scanner;

public class Lab8Assignment2Runner {

    public static void main(String[]args){
Scanner input = new Scanner(System.in);
        System.out.println("1.Computer\n2.Laptop");
        System.out.println("Input: ");
        int i = input.nextInt();
        if(i==1) {
            System.out.println("Enter word size: ");
            double a = input.nextDouble();
            System.out.println("Enter memory size: ");
            double b = input.nextDouble();
            System.out.println("Enter Storage size: ");
            double c = input.nextDouble();
            System.out.println("Enter Speed: ");
            double d = input.nextDouble();
            Computer c1 = new Computer(a,b,c,d);
            c1.Comdisplay();
        }else if(i==2){
            System.out.println("Enter Height: ");
            double e = input.nextDouble();
            System.out.println("Enter width: ");
            double f = input.nextDouble();
            System.out.println("Enter length: ");
            double g = input.nextDouble();
            System.out.println("Enter weight: ");
            double h = input.nextDouble();
            Laptop l1 = new Laptop(e,f,g,h);
            l1.lapdisplay();

        }else{
            System.out.println("Error, enter a valid argument.");
        }
    }
}
