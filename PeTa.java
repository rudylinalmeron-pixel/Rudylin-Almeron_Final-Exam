import java.util.Scanner;

public class SupplierDeliveryAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] delivery = new int[10];
        int total = 0;
        int count = 0;
        int largest, smallest;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter delivery of supplier " + (i + 1) + ": ");
            delivery[i] = input.nextInt();

            if (delivery[i] < 0) {
                System.out.println("Invalid! Enter a nonnegative number.");
                i--;
            } else {
                total = total + delivery[i];

                if (delivery[i] >= 100) {
                    count++;
                }
            }
        }

        largest = delivery[0];
        smallest = delivery[0];

        for (int i = 1; i < 10; i++) {
            if (delivery[i] > largest) {
                largest = delivery[i];
            }

            if (delivery[i] < smallest) {
                smallest = delivery[i];
            }
        }

        double average = total / 10.0;

        System.out.println(" Total Quantity: " + total);
        System.out.println("Average Delivery: " + average);
        System.out.println("Suppliers with at least 100 units: " + count);
        System.out.println("Largest Delivery: " + largest);
        System.out.println("Smallest Delivery: " + smallest);

        input.close();
    }
}