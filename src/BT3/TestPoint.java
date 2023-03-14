package BT3;

import Point2DandPoint3D.Point3D;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point test=new Point(5,6);
        System.out.println(test);
        System.out.println("arr: "+ Arrays.toString(test.getXY()));
    }
}
