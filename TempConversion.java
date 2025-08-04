import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float F = sc.nextFloat();

        float C = (F - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + C);
    }
}