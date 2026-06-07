package dao;

import model.Booking;

import java.util.List;
import java.util.UUID;

public interface Bookingdao {


    int insertbooking(UUID Bookingid, Booking booking); // ✅ ajoute Booking

    List<Booking> selectallbooking(); // ✅ retire UUID

    int getbookingbyid(UUID Bookingid);

    int deletebookingbyid(UUID Bookingid);

    int getbookingbystatues(UUID Bookingid, Booking statues);


    int insertbooking(Booking booking);
}