package com.ecom.Ecommerce.DTO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class InventoryDTO {

    private UUID inventoryId;
    private UUID sellerId;
    private UUID productVariantId;
    private BigDecimal price;
    private int quantityAvailable;
    private String sellerSku;
    private int minOrderQuantity;
    private int maxOrderQuantity;
    private Date createdAt;
    private Date updatedAt;
    private String status; // IN_STOCK, OUT_OF_STOCK

    // Getters and Setters
    public UUID getInventoryId() {
        return inventoryId;
    }
    public void setInventoryId(UUID inventoryId) {
        this.inventoryId = inventoryId;
    }

    public UUID getSellerId() {
        return sellerId;
    }
    public void setSellerId(UUID sellerId) {
        this.sellerId = sellerId;
    }

    public UUID getProductVariantId() {
        return productVariantId;
    }
    public void setProductVariantId(UUID productVariantId) {
        this.productVariantId = productVariantId;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }
    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getSellerSku() {
        return sellerSku;
    }
    public void setSellerSku(String sellerSku) {
        this.sellerSku = sellerSku;
    }

    public int getMinOrderQuantity() {
        return minOrderQuantity;
    }
    public void setMinOrderQuantity(int minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public int getMaxOrderQuantity() {
        return maxOrderQuantity;
    }
    public void setMaxOrderQuantity(int maxOrderQuantity) {
        this.maxOrderQuantity = maxOrderQuantity;
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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
