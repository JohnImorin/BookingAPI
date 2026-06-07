package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("data1")
public class CarrealDao implements Cardao {

    private final Map<UUID, Car> Cardao;

    public CarrealDao() {
        this.Cardao = new HashMap<>();
    }

    @Override
    public int insertcar(UUID Carid, Car car) {
        Cardao.put(Carid, car); // ✅
        return 1;
    }

    @Override
    public int updatecar(UUID Carid, Car car) {
        Cardao.put(Carid, car); // ✅
        return 1;
    }

    @Override
    public int deletecar(UUID Carid) {
        Cardao.remove(Carid); // ✅
        return 1;
    }

    @Override
    public int getcarbyid(UUID Carid) {
        return Cardao.get(Carid) != null ? 1 : 0; // ✅
    }

    @Override
    public List<Car> selectAllCars() {
        return new ArrayList<>(Cardao.values()); // ✅
    }
}