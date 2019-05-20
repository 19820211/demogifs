package com.ak.demogifs.model.repository;

import com.ak.demogifs.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(0, "funny"),
            new Category(1, "sport"),
            new Category(2, "id")
    );

    public List<Category> getAllCategories(){
        return ALL_CATEGORIES;
    }
}
