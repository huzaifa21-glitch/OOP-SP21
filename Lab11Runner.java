public class Lab11Runner {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new rectangle(1.2, 3.4);
        shapes[1] = new triangle(1.2, 1.4);
        shapes[2] = new circle(4.2);
        shapes[3] = new triangle(4,5);
        shapes[4] = new circle(5);

        double[] areas = CalculateAreas.func(shapes);
        for(double a: areas) {
            System.out.println(a);
        }
}
}
