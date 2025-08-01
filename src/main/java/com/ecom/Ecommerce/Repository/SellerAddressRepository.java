package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.SellerAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SellerAddressRepository extends JpaRepository<SellerAddress, UUID> {}
