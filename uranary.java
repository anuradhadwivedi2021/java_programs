import java. lang.*;
public class uranary {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Original a = " + a);
        System.out.println("Original b = " + b);

        // Pre-increment
        System.out.println("++a = " + (++a)); // a becomes 6, then used

        // Post-increment
        System.out.println("b++ = " + (b++)); // b used first (10), then becomes 11
        System.out.println("After b++: b = " + b);

        // Negation
        System.out.println("-a = " + (-a));   // Makes a negative

        // Logical NOT
        boolean flag = true;
        System.out.println("!flag = " + (!flag)); // false
    }
}