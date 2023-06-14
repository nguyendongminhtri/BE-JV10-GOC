package com.example.demo.service.category;

import com.example.demo.model.Category;
import com.example.demo.service.IGenericService;
import org.springframework.stereotype.Service;


public interface ICategoryService extends IGenericService<Category> {
    boolean existsByName(String name);
}
