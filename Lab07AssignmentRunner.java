public class Lab07AssignmentRunner {
    public static void main(String[]args){
        Pizza p1 = new Pizza("L",1,1,2);
        Pizza p2 = new Pizza("M",2,4,1);
        Pizza p3 = new Pizza("S",1,1,1);

        System.out.println(p1.getDescription());
        System.out.println(p1.calcCost());
        System.out.println(p2.getDescription());
        System.out.println(p2.calcCost());
        System.out.println(p3.getDescription());
        System.out.println(p3.calcCost());

        PizzaOrder pizza = new PizzaOrder(p1,p2,p3);

        System.out.println("Total Cost: "+pizza.calcTotal());


    }
}
