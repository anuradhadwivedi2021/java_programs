import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float P = sc.nextFloat();
        System.out.print("Enter Time: ");
        float T = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float R = sc.nextFloat();

        float SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }
}