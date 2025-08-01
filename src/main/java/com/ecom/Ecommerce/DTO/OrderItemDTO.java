package com.ecom.Ecommerce.DTO;

import java.util.UUID;
import java.math.BigDecimal;

public class OrderItemDTO {
    private UUID orderItemId;
    private UUID inventoryId;
    private String productName;
    private int quantity;
    private BigDecimal price;
	public UUID getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(UUID orderItemId) {
		this.orderItemId = orderItemId;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
