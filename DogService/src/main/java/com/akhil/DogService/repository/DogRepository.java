package com.akhil.DogService.repository;

import com.akhil.DogService.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}