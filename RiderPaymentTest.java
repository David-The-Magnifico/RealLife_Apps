import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderPaymentTest {

    @Test
    public void testToCalculatePaymentForLessThan50PercentSuccessfulDeliveries() {
        int successfulDeliveries = 25;
        int expectedPayment = 9000;
        int actualPayment = RiderPayment.calculatePayment(successfulDeliveries);
        assertEquals(expectedPayment, actualPayment);
    }

    @Test
    public void testToCalculatePaymentFor50To59PercentSuccessfulDeliveries() {
        int successfulDeliveries = 55;
        int expectedPayment = 16000;
        int actualPayment = RiderPayment.calculatePayment(successfulDeliveries);
        assertEquals(expectedPayment, actualPayment);
    }

    @Test
    public void testToPaymentFor60To69PercentSuccessfulDeliveries() {
        int successfulDeliveries = 65;
        int expectedPayment = 21250;
        int actualPayment = RiderPayment.calculatePayment(successfulDeliveries);
        assertEquals(expectedPayment, actualPayment);
    }

    @Test
    public void testToCalculatePaymentFor70PercentAndAboveSuccessfulDeliveries() {
        int successfulDeliveries = 80;
        int expectedPayment = 45000;
        int actualPayment = RiderPayment.calculatePayment(successfulDeliveries);
        assertEquals(expectedPayment, actualPayment);
    }

    public int calculatePayment(int successfulDeliveries) {
        return 0;
    }

    @Test
    public void testToCalculatePaymentForAnySuccessfulDeliveries() {
        int successfulDeliveries = 0;
        int expectedPayment = 5000;
        int actualPayment = RiderPayment.calculatePayment(successfulDeliveries);
        assertEquals(expectedPayment, actualPayment);
    }
}

