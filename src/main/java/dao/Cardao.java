package dao;

import model.Car;

import java.util.List;
import java.util.UUID;

public interface Cardao {

    int insertcar(UUID Carid, Car car); // ✅ ajoute Car object

    int updatecar(UUID Carid, Car car);

    int deletecar(UUID Carid);

    int getcarbyid(UUID Carid);

    List<Car> selectAllCars(); // ✅ ajoute sa — manke
}