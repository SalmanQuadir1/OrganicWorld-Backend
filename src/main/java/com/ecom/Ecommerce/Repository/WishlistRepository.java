package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface WishlistRepository extends JpaRepository<Wishlist, UUID> {}
