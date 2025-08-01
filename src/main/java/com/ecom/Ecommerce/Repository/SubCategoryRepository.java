package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.SubCategory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SubCategoryRepository extends JpaRepository<SubCategory, UUID> {
    List<SubCategory> findByCategory_CategoryId(UUID categoryId);
    Page<SubCategory> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
