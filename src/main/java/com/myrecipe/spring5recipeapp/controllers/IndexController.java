package com.myrecipe.spring5recipeapp.controllers;

import com.myrecipe.spring5recipeapp.model.Category;
import com.myrecipe.spring5recipeapp.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class IndexController {

    CategoryRepository categoryRepository;

    public IndexController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        return "index";
    }
}
