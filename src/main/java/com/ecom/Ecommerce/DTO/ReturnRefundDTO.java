package com.ecom.Ecommerce.DTO;

import java.math.BigDecimal;
import java.util.UUID;

public class ReturnRefundDTO {
    private UUID returnId;
    private UUID orderId;
    private String reason;
    private String status;
    private BigDecimal refundAmount;
	public UUID getReturnId() {
		return returnId;
	}
	public void setReturnId(UUID returnId) {
		this.returnId = returnId;
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

    
}

