package Point2DandPoint3D;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D test=new Point3D(3,5,6);
        System.out.println(test);
        System.out.println("arr : "+ Arrays.toString(test.getXYZ()));
    }
}
