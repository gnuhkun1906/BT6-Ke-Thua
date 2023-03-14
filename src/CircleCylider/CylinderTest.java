package CircleCylider;

import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        double radius = sc.nextDouble();
        System.out.println("Nhập vào màu sắc");
        String color = sc.next();
        System.out.println("Nhập vào chiều cao");
        double height= sc.nextDouble();

        Cylinder cylinder = new Cylinder(radius,color,height);
        System.out.println(cylinder);
        System.out.println("Thể tích hình trụ là:  "+cylinder.getArea());
    }


}
