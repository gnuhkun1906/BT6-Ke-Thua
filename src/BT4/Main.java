package BT4;

public class Main {
    public static void main(String[] args) {
        Shape test=new Shape(3,4,5);
        System.out.println(test.toString());
        System.out.println("Diện tích triangle: "+test.getArea());
        System.out.println("Chu Vi triangle: "+test.getPerimeter());

    }
}
