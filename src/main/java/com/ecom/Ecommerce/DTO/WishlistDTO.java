package com.ecom.Ecommerce.DTO;

import java.util.UUID;

public class WishlistDTO {
    private UUID wishlistId;
    private UUID userId;
    private UUID productId;
    private String productName;
	public UUID getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(UUID wishlistId) {
		this.wishlistId = wishlistId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

    
}
