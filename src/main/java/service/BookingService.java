package service;

import dao.Bookingdao;
import model.Booking;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BookingService {

    private final Bookingdao bookingdao;

    public BookingService(@Qualifier("data") Bookingdao bookingdao) {
        this.bookingdao = bookingdao;
    }

    public int persistbooking(Booking booking) {
        return bookingdao.insertbooking(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingdao.selectallbooking();
    }

    public int getbookingbyid(UUID Bookingid) {
        return bookingdao.getbookingbyid(Bookingid);
    }

    public int deletebooking(UUID Bookingid) {
        return bookingdao.deletebookingbyid(Bookingid);
    }

    public int updatebooking(UUID Bookingid, Booking booking) {
        return bookingdao.insertbooking(Bookingid, booking);
    }


}