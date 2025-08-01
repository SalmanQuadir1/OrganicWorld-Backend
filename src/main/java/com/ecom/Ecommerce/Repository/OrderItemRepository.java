package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {}
