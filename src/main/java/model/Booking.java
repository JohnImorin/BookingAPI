package model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking  {



    private final UUID id;
    private final UUID Customerid;
    private final UUID Carid;
    private final String serviceType;
    private final LocalDateTime bookingDate;
    private final String status;


    public Booking(UUID id, UUID customerid, UUID carid, String serviceType, LocalDateTime bookingDate, String status) {
        this.id = id;
        Customerid = customerid;
        Carid = carid;
        this.serviceType = serviceType;
        this.bookingDate = bookingDate;
        this.status = status;
    }


    public UUID getId() {
        return id;
    }

    public UUID getCustomerid() {
        return Customerid;
    }

    public UUID getCarid() {
        return Carid;
    }

    public String getServiceType() {
        return serviceType;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public String getStatus() {
        return status;
    }
}