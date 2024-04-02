package com.example.todorest.service;

import com.example.todorest.entity.Category;
import com.example.todorest.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Transactional
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public Category findById(Long id) {
        return repository.findById(id).get();
    }

    public List<Category> findAll(String email) {
        return repository.findAllByUserEmail(email);
    }

    public Category add(Category category) {
        return repository.save(category);
    }
}
