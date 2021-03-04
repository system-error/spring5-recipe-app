package com.myrecipe.spring5recipeapp.repositories;

import com.myrecipe.spring5recipeapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category,Long> {

   Optional<Category> findCategoryByDescription(String description);

}
