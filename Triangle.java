public class Triangle implements shape {
        double length, width;

        public Triangle(double l, double w){
            length = l;
            width = w;
        }

        @Override
        public double area() {

            return 0.5*(length * width);
        }
    }

