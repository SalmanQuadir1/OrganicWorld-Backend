package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CartItemRepository extends JpaRepository<CartItem, UUID> {}
