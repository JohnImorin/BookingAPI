package service;

import dao.Customerdao;
import model.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    private final Customerdao customerdao;

    public CustomerService(@Qualifier("data2") Customerdao customerdao) {
        this.customerdao = customerdao;
    }

    public int persistcustomer(UUID Customerid, Customer customer) {
        return customerdao.insertNewcustomer(Customerid, customer);
    }

    public Customer getCustomer(UUID Customerid) {
        return customerdao.selectcustomerbyid(Customerid);
    }

    public List<Customer> selectAllCustomer() {
        return customerdao.selectAllcustomer();
    }

    public int updatecustomer(UUID Customerid, Customer customer) {
        return customerdao.updatecustomerbyid(Customerid, customer);
    }

    public int deleteCustomer(UUID Customerid) {
        return customerdao.deletecustomer(Customerid);
    }
}