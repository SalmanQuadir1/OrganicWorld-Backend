package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.CategoryDTO;
import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategoryById(UUID categoryId);
   // List<CategoryDTO> getAllCategories();
    Page<CategoryDTO> getAllCategories(int page, int size, String search); // NEW

    CategoryDTO updateCategory(UUID categoryId, CategoryDTO categoryDTO);
    void deleteCategory(UUID categoryId);
}
