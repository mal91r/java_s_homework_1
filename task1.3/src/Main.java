import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}