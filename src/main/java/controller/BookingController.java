package controller;

import model.Booking;
import org.springframework.web.bind.annotation.*;
import service.BookingService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/booking")
public class BookingController {

    private final BookingService bookingservice; // ✅ private final

    public BookingController(BookingService bookingservice) {
        this.bookingservice = bookingservice;
    }

    @PostMapping
    public String persistBooking(@RequestBody Booking booking) { // ✅ Booking pa UUID
        UUID id = UUID.randomUUID();
        int result = bookingservice.persistbooking( booking);
        if (result == 1) return "Booking created";
        return "Failed";
    }

    @GetMapping
    public List<Booking> getAllBookings() { // ✅ GET all
        return bookingservice.getAllBookings();
    }

    @GetMapping("/{id}")
    public int getBookingById(@RequestBody Booking booking) { // ✅ GET one
        return bookingservice.persistbooking(booking); // ✅ getbookingbyid pa persistbooking
    }

    @PutMapping("/{id}") // ✅ PUT pa GET
    public String updateBooking(@PathVariable UUID id,
                                @RequestBody Booking booking) {
        int result = bookingservice.updatebooking(id, booking);
        if (result == 1) return "Booking updated";
        return "Not found";
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable UUID id) {
        int result = bookingservice.deletebooking(id);
        if (result == 1) return "Booking deleted";
        return "Not found";
    }
}