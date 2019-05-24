package com.ak.demogifs.controller;

import com.ak.demogifs.model.Category;
import com.ak.demogifs.model.Gif;
import com.ak.demogifs.model.repository.CategoryRepository;
import com.ak.demogifs.model.repository.GifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    GifRepository gifRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categoryList = categoryRepository.getAllCategories();
        // 2. Przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String gifsCategory(@PathVariable int id, ModelMap modelMap){

        // 1. Pobranie gifów z id danej kategorii
        List<Gif> gifsByCategory = gifRepository.getGifByCategoryId(id);

        // 2. Pobranie kategorii po Id
        Category category = categoryRepository.getCategoryById(id);

        modelMap.put("gifs", gifsByCategory);
        modelMap.put("category", category);

        return "category";
    }

}
