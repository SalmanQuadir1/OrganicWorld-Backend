package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.ReturnRefund;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ReturnRefundRepository extends JpaRepository<ReturnRefund, UUID> {}
