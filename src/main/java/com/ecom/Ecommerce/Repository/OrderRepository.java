package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {}
