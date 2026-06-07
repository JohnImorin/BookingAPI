package dao;

import model.Customer;

import java.util.List;
import java.util.UUID;

public interface Customerdao {

    int insertNewcustomer(UUID Customerid, Customer customer); // ✅ ajoute UUID

    int getcustomerbyid(UUID Customerid);

    Customer selectcustomerbyid(UUID Customerid); // ✅ retounen Customer

    List<Customer> selectAllcustomer();

    int updatecustomerbyid(UUID Customerid, Customer customer);

    int deletecustomer(UUID Customerid);
}