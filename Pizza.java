public class Pizza {
    private String size;
    double cost=0;
    private int chztoppings,peptoppings,hamtoppings;

    public Pizza(){

    }
    public Pizza(String a, int x,int y,int z){
        size=a;
        chztoppings=x;
        peptoppings=y;
        hamtoppings=z;

    }

    public double calcCost(){

        int toppings = chztoppings + peptoppings + hamtoppings;

        if(size=="S"||size=="s"){
           cost=10;
           for (int i = 1; i<= toppings; i++){
               cost+=2;
           }
           return cost;
        }else if(size=="M"||size=="m"){
            cost=12;
            for (int i = 1; i<= toppings; i++){
                cost+=2;
            }
            return cost;

        }else
            cost=14;
        for (int i = 1; i<=toppings; i++){
            cost+=2;
        }
        return cost;

    }
    public String getDescription(){
        return "Pizza size: "+size+"\nCheese Toppings: "+chztoppings+"\nPepperoni Toppings: "+peptoppings+"\nHam Toppings: "+hamtoppings;
    }


}
