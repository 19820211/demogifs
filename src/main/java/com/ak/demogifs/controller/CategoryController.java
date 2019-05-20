package com.ak.demogifs.controller;

import com.ak.demogifs.model.Category;
import com.ak.demogifs.model.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String gifCategories(ModelMap modelMap){

        List<Category> categoryList = categoryRepository.getAllCategories();
        // 2. Przekazanie obiektów do widoku
        modelMap.put("categories", categoryList);
        return "categories";
    }

}
