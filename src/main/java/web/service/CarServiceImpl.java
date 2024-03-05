package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "white", 2005));
        cars.add(new Car("Mersedes", "black", 2010));
        cars.add(new Car("Ferrari", "grey", 2015));
        cars.add(new Car("Toyota", "yellow", 2020));
        cars.add(new Car("Audi", "blue", 2023));
    }

    public List<Car> getCarsCount(int count) {
        if (count <= 0 || count >= 5)
            return cars;
        return cars.stream().limit(count).collect(Collectors.toList());

    }
}
