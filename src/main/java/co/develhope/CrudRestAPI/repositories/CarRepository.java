package co.develhope.CrudRestAPI.repositories;

import co.develhope.CrudRestAPI.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car,Long> {
}
