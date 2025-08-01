package com.ecom.Ecommerce.DTO;

import java.util.UUID;

public class ShipmentDTO {
    private UUID shipmentId;
    private UUID orderId;
    private String courierName;
    private String trackingNumber;
    private String shipmentStatus;
	public UUID getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(UUID shipmentId) {
		this.shipmentId = shipmentId;
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public String getCourierName() {
		return courierName;
	}
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

   
}
