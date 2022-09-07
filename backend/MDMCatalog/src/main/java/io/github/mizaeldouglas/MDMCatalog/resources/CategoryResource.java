package io.github.mizaeldouglas.MDMCatalog.resources;

import io.github.mizaeldouglas.MDMCatalog.dto.CategoryDTO;
import io.github.mizaeldouglas.MDMCatalog.entities.Category;
import io.github.mizaeldouglas.MDMCatalog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll(){

		List<CategoryDTO> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

}
