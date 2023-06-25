import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int num;
        int numLow = Integer.MAX_VALUE;
        int numHigh = Integer.MIN_VALUE;
        int i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = scanner.nextInt();

        // Find the smallest and largest numbers in the list
        while (i < list.length) {
            if (list[i] < numLow)
                numLow = list[i];
            if (list[i] > numHigh)
                numHigh = list[i];
            i++;
        }

        i = 0;
        // Find the closest number smaller than 'num' and the closest number larger than 'num'
        while (i < list.length) {
            if (list[i] < num && list[i] > numLow)
                numLow = list[i];
            if (list[i] > num && list[i] < numHigh)
                numHigh = list[i];
            i++;
        }

        System.out.println("Closest number smaller than " + num + ": " + numLow);
        System.out.println("Closest number larger than " + num + ": " + numHigh);

        scanner.close();
    }
}
