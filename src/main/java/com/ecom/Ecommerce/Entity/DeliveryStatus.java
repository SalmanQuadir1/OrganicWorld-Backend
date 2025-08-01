package com.ecom.Ecommerce.Entity;



import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class DeliveryStatus {

    @Id
    @GeneratedValue
    private UUID statusId;

   // @Enumerated(EnumType.STRING)
    private String status;

    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

	public UUID getStatusId() {
		return statusId;
	}

	public void setStatusId(UUID statusId) {
		this.statusId = statusId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
    
    
    
    
}

