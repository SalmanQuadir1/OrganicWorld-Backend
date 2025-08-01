package com.ecom.Ecommerce.DTO;

import java.math.BigDecimal;
import java.util.UUID;

public class DiscountDTO {
    private UUID discountId;
    private String name;
    private BigDecimal discountPercentage;
    private boolean active;
    private UUID productId;
	public UUID getDiscountId() {
		return discountId;
	}
	public void setDiscountId(UUID discountId) {
		this.discountId = discountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(BigDecimal discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public UUID getProductId() {
		return productId;
	}
	public void setProductId(UUID productId) {
		this.productId = productId;
	}

 
}
