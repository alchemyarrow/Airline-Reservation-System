package JUnitTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Ticket;

public class TicketTest {

    @Test
    public void testTicketEntity() {
        // Create a Booking instance
        Booking booking = new Booking();
        booking.setId(1L);

        // Create a Passenger instance
        Passenger passenger = new Passenger();
        passenger.setId(1L);

        // Create a Ticket instance
        Ticket ticket = new Ticket();
        ticket.setId(1L);
        ticket.setBooking(booking);
        ticket.setPassenger(passenger);
        ticket.setTicketNumber("T123456");
        ticket.setTicketStatus("CONFIRMED");

        // Verify that the ticket ID matches the expected value
        assertEquals(Long.valueOf(1), ticket.getId());

        // Verify that the booking associated with the ticket is not null
        assertNotNull(ticket.getBooking());

        // Verify that the passenger associated with the ticket is not null
        assertNotNull(ticket.getPassenger());

        // Verify that the ticket number matches the expected value
        assertEquals("T123456", ticket.getTicketNumber());

        // Verify that the ticket status matches the expected value
        assertEquals("CONFIRMED", ticket.getTicketStatus());
    }
}
