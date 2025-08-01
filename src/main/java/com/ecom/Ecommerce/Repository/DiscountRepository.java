package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface DiscountRepository extends JpaRepository<Discount, UUID> {}
