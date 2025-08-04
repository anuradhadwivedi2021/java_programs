import java.util.Scanner;

public class Trianglearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        float base = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        float area = 0.5f * base * height;
        System.out.println("Area of triangle: " + area);
    }
}