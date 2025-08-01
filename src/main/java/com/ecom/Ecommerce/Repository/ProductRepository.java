package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Product;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
	
	List<Product> findBySubCategory_SubCategoryId(UUID subCategoryId);
	List<Product> findByBrand_BrandId(UUID brandId);
	List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);

}
