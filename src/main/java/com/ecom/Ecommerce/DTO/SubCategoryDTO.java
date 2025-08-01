package com.ecom.Ecommerce.DTO;

import java.util.Date;
import java.util.UUID;

public class SubCategoryDTO {
    private UUID subCategoryId;
    private String name;
    private String description;
    private UUID categoryId;
    private Date createdAt;
    private Date updatedAt;

    // Getters and Setters
    public UUID getSubCategoryId() {
        return subCategoryId;
    }
    public void setSubCategoryId(UUID subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
