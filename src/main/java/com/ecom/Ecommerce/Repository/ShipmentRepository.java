package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ShipmentRepository extends JpaRepository<Shipment, UUID> {}
