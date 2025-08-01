package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {}
