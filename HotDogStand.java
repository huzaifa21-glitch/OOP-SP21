public class HotDogStand {

    private int id;
    private int solditems;
    private static int totalitems=0;

    public HotDogStand(int x, int y) {
        id = x;
        solditems =y;
        totalitems=totalitems+y;
    }
    public void justSold(){
        solditems=+solditems;
    }
    public int get(){
        return solditems;
    }
    public static void total(){
        System.out.println("Total number of hog dogs sold:"+totalitems);

    }


}
