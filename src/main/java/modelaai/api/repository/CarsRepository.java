package modelaai.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import modelaai.api.model.Car;

public interface CarsRepository extends JpaRepository<Car, Long> {
    
}
