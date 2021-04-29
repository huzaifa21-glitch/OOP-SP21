class ClockExtended extends Clock{

    public ClockExtended(String hrs, String mins, String secs){
        super(hrs,mins,secs);
    }
    @Override
    public void display(){
        System.out.println("12 hour format:");
        super.display();
        int h1 = (int)hrs.charAt(0) - '0';
        int h2 = (int)hrs.charAt(1)- '0';
        int totalH = h1 + h2;
        String q;
        System.out.println("24 hour format:");
        if(totalH>12){
            q=" AM";
        }else {
            q=" PM";
        }
        if(totalH==0){
            System.out.print("12");
            System.out.print(":"+mins+":"+secs+q);

        }else {
         totalH +=12;
            System.out.print(totalH+":"+mins+":"+secs);
            System.out.print(q);

        }

        }

    public static void main(String[] args) {
        ClockExtended c1 = new ClockExtended("03","23","34");
        c1.display();

    }
}