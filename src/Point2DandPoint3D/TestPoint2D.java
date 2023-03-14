package Point2DandPoint3D;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D test=new Point2D(9,3);
        System.out.println(test);
        System.out.println("abc"+ Arrays.toString(test.getXY()));
    }
}
