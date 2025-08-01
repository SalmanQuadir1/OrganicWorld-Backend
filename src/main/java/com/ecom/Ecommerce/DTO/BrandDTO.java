package com.ecom.Ecommerce.DTO;

import java.util.Date;
import java.util.UUID;

public class BrandDTO {
    private UUID brandId;
    private String name;
    private String logoUrl;
    private Date createdAt;
    private Date updatedAt;

    // Getters & Setters
    public UUID getBrandId() {
        return brandId;
    }
    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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
