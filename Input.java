import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        System.out.println("please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("welcome ji" + name);
    }
}