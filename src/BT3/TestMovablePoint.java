package BT3;

import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint test=new MovablePoint(3,5,6,9);
        System.out.println(test);
        System.out.println("arr: "+ Arrays.toString(test.getSpeed()));
        System.out.println("move : "+test.move());
    }
}
