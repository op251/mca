import java.util.Scanner;
public class k_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting limit: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending limit: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nFibonacci numbers between " + start + " and " + end + ":");
        int first = 0, second = 1;
        while (first <= end) {
            if (first >= start) {
                System.out.print(first + " ");
            }
            int next = first + second;
            first = second;
            second = next;
}  

        scanner.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

