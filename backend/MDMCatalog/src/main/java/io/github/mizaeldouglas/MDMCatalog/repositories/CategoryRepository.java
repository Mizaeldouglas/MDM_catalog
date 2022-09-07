package io.github.mizaeldouglas.MDMCatalog.repositories;

import io.github.mizaeldouglas.MDMCatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
