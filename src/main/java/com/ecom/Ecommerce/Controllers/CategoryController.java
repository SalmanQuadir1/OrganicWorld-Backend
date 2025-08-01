package com.ecom.Ecommerce.Controllers;

import com.ecom.Ecommerce.DTO.CategoryDTO;
import com.ecom.Ecommerce.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Create new Category
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        return ResponseEntity.ok(categoryService.createCategory(categoryDTO));
    }

    // Get Category by ID
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategory(@PathVariable UUID id) {
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }

    // Get all Categories
//    @GetMapping
//    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
//        return ResponseEntity.ok(categoryService.getAllCategories());
//    }

    // Update Category
    @PutMapping("/{id}")
    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable UUID id, @RequestBody CategoryDTO categoryDTO) {
        return ResponseEntity.ok(categoryService.updateCategory(id, categoryDTO));
    }

    // Delete Category
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable UUID id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllCategories(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(required = false) String search) {

        Page<CategoryDTO> categoryPage = categoryService.getAllCategories(page, size, search);

        Map<String, Object> response = new HashMap<>();
        response.put("categories", categoryPage.getContent());
        response.put("currentPage", categoryPage.getNumber());
        response.put("totalPages", categoryPage.getTotalPages());
        response.put("totalItems", categoryPage.getTotalElements());

        return ResponseEntity.ok(response);
    }

}
