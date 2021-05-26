public class CalculateAreas {
    static double[] yo(shape[] shapes) {
        double[] res = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                res[i] = shapes[i].area();
        }
        return res;
    }
}
