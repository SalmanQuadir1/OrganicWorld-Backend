package com.ecom.Ecommerce.DTO;

import java.math.BigDecimal;
import java.util.UUID;

public class CouponDTO {
    private UUID couponId;
    private String code;
    private BigDecimal discountAmount;
    private BigDecimal minOrderValue;
    private boolean active;
	public UUID getCouponId() {
		return couponId;
	}
	public void setCouponId(UUID couponId) {
		this.couponId = couponId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getMinOrderValue() {
		return minOrderValue;
	}
	public void setMinOrderValue(BigDecimal minOrderValue) {
		this.minOrderValue = minOrderValue;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

   
}
