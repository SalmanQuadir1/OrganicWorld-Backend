package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.OrderStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderStatusHistoryRepository extends JpaRepository<OrderStatusHistory, UUID> {}
