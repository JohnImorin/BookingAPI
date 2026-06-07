package controller;

import model.Car;
import org.springframework.web.bind.annotation.*;
import service.CarService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/car")
public class CarController {

    private final CarService carservice; // ✅ private final

    public CarController(CarService carservice) {
        this.carservice = carservice;
    }

    @PostMapping
    public String persistcar(@RequestBody Car car) { // ✅ Car pa UUID
        UUID id = UUID.randomUUID();
        int result = carservice.persistcar(id, car);
        if (result == 1) return "Car added";
        return "Failed";
    }

    @GetMapping
    public List<Car> getAllCars() { // ✅ GET all
        return carservice.getAllCars();
    }

    @GetMapping("/{id}") // ✅ path diferan
    public int getcarbyid(@PathVariable UUID id) {
        return carservice.getcarbyid(id);
    }

    @PutMapping("/{id}") // ✅ PUT pa GET
    public String updatecar(@PathVariable UUID id,
                            @RequestBody Car car) {
        int result = carservice.updatecar(id, car);
        if (result == 1) return "Car updated";
        return "Not found";
    }

    @DeleteMapping("/{id}")
    public String deletecar(@PathVariable UUID id) {
        int result = carservice.deletecar(id);
        if (result == 1) return "Car deleted";
        return "Not found";
    }
}