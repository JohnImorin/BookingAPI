package dao;

import model.Booking;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("data")
public class BookingrealDao implements Bookingdao {

    private final Map<UUID, Booking> Bookingdao;

    public BookingrealDao() {
        this.Bookingdao = new HashMap<>();
    }

    @Override
    public int insertbooking(UUID Bookingid, Booking booking) {
        Bookingdao.put(Bookingid, booking); // ✅
        return 1;
    }

    @Override
    public List<Booking> selectallbooking() {
        return new ArrayList<>(Bookingdao.values()); // ✅
    }

    @Override
    public int getbookingbyid(UUID Bookingid) {
        return Bookingdao.get(Bookingid) != null ? 1 : 0; // ✅
    }

    @Override
    public int deletebookingbyid(UUID Bookingid) {
        Bookingdao.remove(Bookingid); // ✅
        return 1;
    }

    @Override
    public int getbookingbystatues(UUID Bookingid, Booking statues) {
        Booking booking = Bookingdao.get(Bookingid);
        if (booking == null) return 0;
        return booking.getStatus().equals(statues.getStatus()) ? 1 : 0; // ✅
    }

    @Override
    public int insertbooking(Booking booking) {
        return 1;
    }
}