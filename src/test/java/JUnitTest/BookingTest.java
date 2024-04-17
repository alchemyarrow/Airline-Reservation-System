package JUnitTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;

public class BookingTest {

    @Test
    public void testBookingEntity() {
        // Create a Passenger instance
        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setName("John Doe");

        // Create a Flight instance
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setDepartureAirport("Airport1");
        flight.setArrivalAirport("Airport2");

        // Create a Booking instance
        Booking booking = new Booking();
        booking.setId(1L);
        booking.setPassenger(passenger);
        booking.setFlight(flight);
        booking.setSeatNumber("A1");
        booking.setBookingStatus("CONFIRMED");

        // Verify that the booking ID matches the expected value
        assertEquals(Long.valueOf(1), booking.getId());

        // Verify that the passenger associated with the booking is not null
        assertNotNull(booking.getPassenger());

        // Verify that the flight associated with the booking is not null
        assertNotNull(booking.getFlight());

        // Verify that the seat number matches the expected value
        assertEquals("A1", booking.getSeatNumber());

        // Verify that the booking status matches the expected value
        assertEquals("CONFIRMED", booking.getBookingStatus());
    }
}
