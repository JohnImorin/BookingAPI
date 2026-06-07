package controller;

import model.Customer;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    private final CustomerService customerservice; // ✅ private final

    public CustomerController(CustomerService customerservice) {
        this.customerservice = customerservice;
    }

    @PostMapping
    public String persistcustomer(@RequestBody Customer customer) {
        UUID id = UUID.randomUUID();
        int result = customerservice.persistcustomer(id, customer);
        if (result == 1) return "Customer added";
        return "Failed";
    }

    @GetMapping // ✅ yon sèl GET sou base path
    public List<Customer> getAllCustomers() {
        return customerservice.selectAllCustomer();
    }

    @GetMapping("/{id}") // ✅ path diferan
    public Customer getCustomer(@PathVariable UUID id) {
        return customerservice.getCustomer(id);
    }

    @PutMapping("/{id}") // ✅ PUT pa GET
    public String updateCustomer(@PathVariable UUID id,
                                 @RequestBody Customer customer) {
        int result = customerservice.updatecustomer(id, customer);
        if (result == 1) return "Customer updated";
        return "Not found";
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable UUID id) {
        int result = customerservice.deleteCustomer(id);
        if (result == 1) return "Customer deleted";
        return "Not found";
    }
}