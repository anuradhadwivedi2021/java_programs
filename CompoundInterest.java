import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double R = sc.nextDouble();

        double CI = P * Math.pow((1 + R / 100), T) - P;
        System.out.println("Compound Interest: " + CI);
    }
}