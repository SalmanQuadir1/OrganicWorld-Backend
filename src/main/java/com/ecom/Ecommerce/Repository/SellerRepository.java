package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SellerRepository extends JpaRepository<Seller, UUID> {}
