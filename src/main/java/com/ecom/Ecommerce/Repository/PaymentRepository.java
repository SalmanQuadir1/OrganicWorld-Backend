package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface PaymentRepository extends JpaRepository<Payment, UUID> {}
