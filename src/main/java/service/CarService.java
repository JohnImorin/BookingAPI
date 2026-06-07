package service;

import dao.Cardao;
import model.Car;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {

    private final Cardao cardao;

    public CarService(@Qualifier("data1") Cardao cardao) {
        this.cardao = cardao;
    }

    public int persistcar(UUID Carid, Car car) {
        return cardao.insertcar(Carid, car);
    }

    public List<Car> getAllCars() {
        return cardao.selectAllCars();
    }

    public int getcarbyid(UUID Carid) {
        return cardao.getcarbyid(Carid);
    }

    public int updatecar(UUID Carid, Car car) {
        return cardao.updatecar(Carid, car);
    }

    public int deletecar(UUID Carid) {
        return cardao.deletecar(Carid);
    }
}