import java.io.IOException;

public class Main {
    public static int Fibonacci(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Enter N:");
        int n = System.in.read() - '0';
        for(int i = 0; i < n; i++){
            System.out.println(Fibonacci(i));
        }
    }
}