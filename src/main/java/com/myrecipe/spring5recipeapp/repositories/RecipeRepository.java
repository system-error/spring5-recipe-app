package com.myrecipe.spring5recipeapp.repositories;

import com.myrecipe.spring5recipeapp.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
