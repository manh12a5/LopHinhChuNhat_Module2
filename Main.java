import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nhập chiều dài và chiều rộng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        //
        LopHinhChuNhat rectangle = new LopHinhChuNhat(width, height);

        //Hiển thị thông tin
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
