package com.productManager.productManager.service;

import com.productManager.productManager.entity.Supplier;
import com.productManager.productManager.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository repo;

    public List<Supplier> findAll() { return repo.findAll(); }
    public Supplier save(Supplier p) { return repo.save(p); }
    public void delete(Long id) { repo.deleteById(id); }
}
