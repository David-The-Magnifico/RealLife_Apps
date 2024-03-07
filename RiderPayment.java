import java.util.Scanner;

public class RiderPayment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of successful deliveries: ");
        int successfulDeliveries = scanner.nextInt();
        int payment = calculatePayment(successfulDeliveries);
        System.out.println("The rider's payment is: " + payment);
    }

    public static int calculatePayment(int successfulDeliveries) {
        int basePay = 5000;
        int amountPerParcel;

        if (successfulDeliveries <= 50) {
            amountPerParcel = 160;
        } else if (successfulDeliveries <= 59) {
            amountPerParcel = 200;
        } else if (successfulDeliveries <= 69) {
            amountPerParcel = 250;
        } else {
            amountPerParcel = 500;
        }

        return basePay + (amountPerParcel * successfulDeliveries);
    }
}
