package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, UUID> {}
