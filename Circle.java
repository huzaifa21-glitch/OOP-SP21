import java.text.DecimalFormat;

public class Circle implements shape {

        double radius;
        public Circle(double r){
            radius=r;
        }

        @Override
        public double area() {

            return radius * radius * Math.PI;

        }
    }

