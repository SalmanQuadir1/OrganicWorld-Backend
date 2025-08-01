package com.ecom.Ecommerce.Controllers;

import com.ecom.Ecommerce.DTO.SubCategoryDTO;
import com.ecom.Ecommerce.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/subcategories")
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    @PostMapping
    public ResponseEntity<SubCategoryDTO> createSubCategory(@RequestBody SubCategoryDTO subCategoryDTO) {
        return ResponseEntity.ok(subCategoryService.createSubCategory(subCategoryDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubCategoryDTO> getSubCategory(@PathVariable UUID id) {
        return ResponseEntity.ok(subCategoryService.getSubCategoryById(id));
    }

//    @GetMapping
//    public ResponseEntity<List<SubCategoryDTO>> getAllSubCategories() {
//        return ResponseEntity.ok(subCategoryService.getAllSubCategories());
//    }

    @GetMapping("/by-category/{categoryId}")
    public ResponseEntity<List<SubCategoryDTO>> getSubCategoriesByCategory(@PathVariable UUID categoryId) {
        return ResponseEntity.ok(subCategoryService.getSubCategoriesByCategory(categoryId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubCategoryDTO> updateSubCategory(@PathVariable UUID id, @RequestBody SubCategoryDTO subCategoryDTO) {
        return ResponseEntity.ok(subCategoryService.updateSubCategory(id, subCategoryDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSubCategory(@PathVariable UUID id) {
        subCategoryService.deleteSubCategory(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping
    public ResponseEntity<Map<String, Object>> getAllSubCategories(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "") String search) {

        return ResponseEntity.ok(subCategoryService.getAllSubCategoriesPaginated(page, size, search));
    }

}
