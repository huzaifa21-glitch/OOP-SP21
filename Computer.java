public class Computer {
    double wordsize,memorysize,Storagesize,speed;
Computer(){

}
Computer(double w,double m, double s, double sp){
    wordsize=w;
    memorysize=m;
    Storagesize=s;
    speed=sp;

}
public void Comdisplay(){
    System.out.println("Word size: "+wordsize);
    System.out.println("Memory size: "+memorysize);
    System.out.println("Storage size: "+Storagesize);
    System.out.println("Speed: "+speed);
}


}class Laptop extends Computer{
    double width,length,height,weight;
    Laptop(){

    }
    Laptop(double w, double l, double h, double we){
        width=w;
        length=l;
        height=h;
        weight=we;
    }
    public void lapdisplay(){
        System.out.println("Width: "+width);
    System.out.println("Length: "+length);
    System.out.println("Height: "+height);
    System.out.println("Weight: "+weight);

    }
}
