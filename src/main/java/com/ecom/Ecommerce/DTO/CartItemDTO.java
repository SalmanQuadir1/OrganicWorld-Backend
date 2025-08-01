package com.ecom.Ecommerce.DTO;

import java.util.UUID;
import java.math.BigDecimal;

public class CartItemDTO {
    private UUID cartItemId;
    private UUID inventoryId;
    private String productName;
    private int quantity;
    private BigDecimal priceAtAddition;
	public UUID getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(UUID cartItemId) {
		this.cartItemId = cartItemId;
	}
	public UUID getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(UUID inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPriceAtAddition() {
		return priceAtAddition;
	}
	public void setPriceAtAddition(BigDecimal priceAtAddition) {
		this.priceAtAddition = priceAtAddition;
	}

   
}
