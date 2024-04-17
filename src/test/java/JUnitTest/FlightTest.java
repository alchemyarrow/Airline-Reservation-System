package JUnitTest;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;

import org.junit.Test;

import com.example.demo.entity.Flight;

public class FlightTest {

    @Test
    public void testFlightEntity() {
        // Create a Flight instance
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setFlightNumber("ABC123");
        flight.setDepartureAirport("Airport1");
        flight.setArrivalAirport("Airport2");
        flight.setDepartureTime(new Date(System.currentTimeMillis()));
        flight.setArrivalTime(new Date(System.currentTimeMillis() + 3600000)); // Adding 1 hour
        flight.setAircraftType("Boeing 737");

        // Verify that the flight ID matches the expected value
        assertEquals(Long.valueOf(1), flight.getId());

        // Verify that the flight number matches the expected value
        assertEquals("ABC123", flight.getFlightNumber());

        // Verify that the departure airport matches the expected value
        assertEquals("Airport1", flight.getDepartureAirport());

        // Verify that the arrival airport matches the expected value
        assertEquals("Airport2", flight.getArrivalAirport());

        // Verify that the departure time is not null
        assertNotNull(flight.getDepartureTime());

        // Verify that the arrival time is not null
        assertNotNull(flight.getArrivalTime());

        // Verify that the aircraft type matches the expected value
        assertEquals("Boeing 737", flight.getAircraftType());
    }
}

