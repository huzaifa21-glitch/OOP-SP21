public class Rectangle implements shape {
        double length, width;

        public Rectangle(double l, double w){
            length = l;
            width = w;
        }
        @Override
        public double area() {

            return length * width;
        }
    }

