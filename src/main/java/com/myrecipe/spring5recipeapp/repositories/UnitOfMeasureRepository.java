package com.myrecipe.spring5recipeapp.repositories;

import com.myrecipe.spring5recipeapp.model.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String unitOfMeasure);
}
