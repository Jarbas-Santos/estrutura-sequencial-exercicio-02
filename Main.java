import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r, pi = 3.14159, area;

        r = sc.nextDouble();

        area = pi * r * r;

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}