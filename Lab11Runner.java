public class Lab11Runner {
    public static void main(String[] args) {


        shape[] shapes = new shape[5];
        shapes[0] = new Rectangle(3.2, 6.9);
        shapes[1] = new Triangle(4.20, 9.11);
        shapes[2] = new Circle(7.11);
        shapes[3] = new Triangle(4.3,4.7);
        shapes[4] = new Circle(7.3);

        double[] areas = CalculateAreas.yo(shapes);
        for (double area : areas) {
            System.out.println(area);
        }
    }
}
