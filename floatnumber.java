import java.util.Scanner;
public class floatnumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = input.nextFloat();
        System.out.println("Enter second number");
        float b = input.nextFloat();
        float product = a*b;
        System.out.println("product" + product);  
    }
}