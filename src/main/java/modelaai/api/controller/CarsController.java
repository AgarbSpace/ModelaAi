package modelaai.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelaai.api.DTO.CarDTO;
import modelaai.api.model.Car;
import modelaai.api.repository.CarsRepository;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    
    @Autowired
    private CarsRepository repository;

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> findAll() {
        return repository.findAll();
    }
}