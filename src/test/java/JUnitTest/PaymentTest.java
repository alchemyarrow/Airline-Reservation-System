package JUnitTest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Payment;

public class PaymentTest {

    @Test
    public void testPaymentEntity() {
        // Create a Booking instance
        Booking booking = new Booking();
        booking.setId(1L);

        // Create a Payment instance
        Payment payment = new Payment();
        payment.setId(1L);
        payment.setBooking(booking);
        payment.setAmount(100.00);
        payment.setPaymentMethod("Credit Card");
        payment.setPaymentStatus("PAID");

        // Verify that the payment ID matches the expected value
        assertEquals(Long.valueOf(1), payment.getId());

        // Verify that the booking associated with the payment is not null
        assertNotNull(payment.getBooking());

        // Verify that the amount matches the expected value
        assertEquals(100.00, payment.getAmount(), 0.001);

        // Verify that the payment method matches the expected value
        assertEquals("Credit Card", payment.getPaymentMethod());

        // Verify that the payment status matches the expected value
        assertEquals("PAID", payment.getPaymentStatus());
    }
}

