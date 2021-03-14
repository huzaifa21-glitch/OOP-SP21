public class Lab4Assignment1Runner {
public static void main(String[]args){

    HotDogStand u1 = new HotDogStand(1,9);
    HotDogStand u2 = new HotDogStand(4,2);
    HotDogStand u3 = new HotDogStand(2,8);
    u1.justSold();
    u2.justSold();
    u3.justSold();

    System.out.println("Number of hot dogs sold :"+u1.get());
    System.out.println("Number of hot dogs sold :"+u2.get());
    System.out.println("Number of hot dogs sold :"+u3.get());
    HotDogStand.total();
}

}
