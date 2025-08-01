package com.ecom.Ecommerce.DTO;

import java.util.List;
import java.util.UUID;
import java.math.BigDecimal;

public class OrderResponseDTO {
    private UUID orderId;
    private UUID userId;
    private List<OrderItemDTO> items;
    private BigDecimal totalAmount;
    private String status;
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public List<OrderItemDTO> getItems() {
		return items;
	}
	public void setItems(List<OrderItemDTO> items) {
		this.items = items;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

  
}
