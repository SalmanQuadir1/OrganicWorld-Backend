package com.ecom.Ecommerce.DTO;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

public class CartResponseDTO {
    private UUID cartId;
    private UUID userId;
    private List<CartItemDTO> items;
    private BigDecimal totalAmount;
	public UUID getCartId() {
		return cartId;
	}
	public void setCartId(UUID cartId) {
		this.cartId = cartId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public List<CartItemDTO> getItems() {
		return items;
	}
	public void setItems(List<CartItemDTO> items) {
		this.items = items;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

 
}
