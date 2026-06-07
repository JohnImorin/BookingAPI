package dao;

import model.Customer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("data2")
public class CustomerrealDao implements Customerdao {

    private final Map<UUID, Customer> Customerdao;

    public CustomerrealDao() {
        this.Customerdao = new HashMap<>();
    }

    @Override
    public int insertNewcustomer(UUID Customerid, Customer customer) {
        Customerdao.put(Customerid, customer); // ✅
        return 1;
    }

    @Override
    public int getcustomerbyid(UUID Customerid) {
        return Customerdao.get(Customerid) != null ? 1 : 0; // ✅
    }

    @Override
    public Customer selectcustomerbyid(UUID Customerid) {
        return Customerdao.get(Customerid); // ✅
    }

    @Override
    public List<Customer> selectAllcustomer() {
        return new ArrayList<>(Customerdao.values()); // ✅
    }

    @Override
    public int updatecustomerbyid(UUID Customerid, Customer customer) {
        Customerdao.put(Customerid, customer); // ✅
        return 1;
    }

    @Override
    public int deletecustomer(UUID Customerid) {
        Customerdao.remove(Customerid); // ✅
        return 1;
    }
}