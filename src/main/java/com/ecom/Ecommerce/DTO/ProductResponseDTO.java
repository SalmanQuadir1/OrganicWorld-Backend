package com.ecom.Ecommerce.DTO;

import java.util.List;
import java.util.UUID;

public class ProductResponseDTO {

    private UUID productId;
    private String name;
    private String description;
    private String categoryName;
    private String brandName;
    private List<ProductVariantDTO> variants;

    // Getters & Setters
    public UUID getProductId() { return productId; }
    public void setProductId(UUID productId) { this.productId = productId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }

    public List<ProductVariantDTO> getVariants() { return variants; }
    public void setVariants(List<ProductVariantDTO> variants) { this.variants = variants; }
}
