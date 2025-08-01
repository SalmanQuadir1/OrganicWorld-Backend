package com.ecom.Ecommerce.DTO;

import java.util.UUID;
import java.util.List;

public class OrderRequestDTO {
    private UUID userId;
    private List<OrderItemDTO> items;
    private UUID shippingAddressId;
    private UUID paymentMethodId;
    private String couponCode;
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
	public UUID getShippingAddressId() {
		return shippingAddressId;
	}
	public void setShippingAddressId(UUID shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}
	public UUID getPaymentMethodId() {
		return paymentMethodId;
	}
	public void setPaymentMethodId(UUID paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

    // Getters & Setters
    // ...
}
