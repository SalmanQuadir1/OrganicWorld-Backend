package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.SubCategoryDTO;
import com.ecom.Ecommerce.Entity.Category;
import com.ecom.Ecommerce.Entity.SubCategory;
import com.ecom.Ecommerce.Repository.CategoryRepository;
import com.ecom.Ecommerce.Repository.SubCategoryRepository;
import com.ecom.Ecommerce.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public SubCategoryDTO createSubCategory(SubCategoryDTO subCategoryDTO) {
        Category category = categoryRepository.findById(subCategoryDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        SubCategory subCategory = new SubCategory();
        subCategory.setName(subCategoryDTO.getName());
        subCategory.setDescription(subCategoryDTO.getDescription());
        subCategory.setCategory(category);
        subCategory.setCreatedAt(new Date());
        subCategory.setUpdatedAt(new Date());

        subCategory = subCategoryRepository.save(subCategory);
        return convertToDTO(subCategory);
    }

    @Override
    public SubCategoryDTO getSubCategoryById(UUID subCategoryId) {
        SubCategory subCategory = subCategoryRepository.findById(subCategoryId)
                .orElseThrow(() -> new RuntimeException("SubCategory not found"));
        return convertToDTO(subCategory);
    }

    @Override
    public List<SubCategoryDTO> getAllSubCategories() {
        return subCategoryRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<SubCategoryDTO> getSubCategoriesByCategory(UUID categoryId) {
        return subCategoryRepository.findByCategory_CategoryId(categoryId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SubCategoryDTO updateSubCategory(UUID subCategoryId, SubCategoryDTO subCategoryDTO) {
        SubCategory subCategory = subCategoryRepository.findById(subCategoryId)
                .orElseThrow(() -> new RuntimeException("SubCategory not found"));

        subCategory.setName(subCategoryDTO.getName());
        subCategory.setDescription(subCategoryDTO.getDescription());
        subCategory.setUpdatedAt(new Date());

        subCategory = subCategoryRepository.save(subCategory);
        return convertToDTO(subCategory);
    }

    @Override
    public void deleteSubCategory(UUID subCategoryId) {
        subCategoryRepository.deleteById(subCategoryId);
    }

    private SubCategoryDTO convertToDTO(SubCategory subCategory) {
        SubCategoryDTO dto = new SubCategoryDTO();
        dto.setSubCategoryId(subCategory.getSubCategoryId());
        dto.setName(subCategory.getName());
        dto.setDescription(subCategory.getDescription());
        dto.setCategoryId(subCategory.getCategory().getCategoryId());
        dto.setCreatedAt(subCategory.getCreatedAt());
        dto.setUpdatedAt(subCategory.getUpdatedAt());
        return dto;
    }
}
