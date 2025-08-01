package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.SubCategoryDTO;
import java.util.List;
import java.util.UUID;

public interface SubCategoryService {
    SubCategoryDTO createSubCategory(SubCategoryDTO subCategoryDTO);
    SubCategoryDTO getSubCategoryById(UUID subCategoryId);
    List<SubCategoryDTO> getAllSubCategories();
    List<SubCategoryDTO> getSubCategoriesByCategory(UUID categoryId);
    SubCategoryDTO updateSubCategory(UUID subCategoryId, SubCategoryDTO subCategoryDTO);
    void deleteSubCategory(UUID subCategoryId);
}
