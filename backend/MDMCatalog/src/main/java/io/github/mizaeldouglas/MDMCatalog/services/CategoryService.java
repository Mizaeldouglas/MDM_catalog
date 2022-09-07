package io.github.mizaeldouglas.MDMCatalog.services;

import io.github.mizaeldouglas.MDMCatalog.entities.Category;
import io.github.mizaeldouglas.MDMCatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
	}

}
