package CircleCylider;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        double radius= sc.nextDouble();
        System.out.println("Nhập vào màu sắc");
        String color= sc.next();
        Circle circle=new Circle(radius,color);
        System.out.println(circle);
        System.out.println("Diện tích hình tròn là: "+circle.getArea());

    }
}
