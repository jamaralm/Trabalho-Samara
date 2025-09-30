package com.productManager.productManager.service;

import com.productManager.productManager.entity.Category;
import com.productManager.productManager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repo;

    public List<Category> findAll() { return repo.findAll(); }
    public Category save(Category p) { return repo.save(p); }
    public void delete(Long id) { repo.deleteById(id); }
}
