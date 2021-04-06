public class Calculator {
     public static double num1, num2;

    public Calculator(){

    }
    public Calculator(int x, int y){
        num1 =x;
        num2=y;
    }
    public static double Addition(int a, int b){
        num1=a;
        num2=b;
        return a+b;
    }
    public static double Subtraction(int a, int b){
        num1=a;
        num2=b;
        return a-b;
    }
    public static double Multiply(int a, int b){
        num1=a;
        num2=b;
        return a*b;
    }
    public static double Divide(int a, int b){
        num1=a;
        num2=b;
        return a/b;
    }
    public static double Cos(double degrees){
        double radians = Math.toRadians(degrees);
        double cosValue = Math.cos(radians);
        return cosValue;
    }
    public static double Sin(double degrees){
        double radians = Math.toRadians(degrees);
        double sinValue = Math.sin(radians);
        return sinValue;
    }
    public static double Tan(double degrees){
        double radians = Math.toRadians(degrees);
        double tanValue = Math.tan(radians);
        return tanValue;

    }
}
