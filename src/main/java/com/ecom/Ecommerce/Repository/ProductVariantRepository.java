package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductVariantRepository extends JpaRepository<ProductVariant, UUID> {
    List<ProductVariant> findByProduct_ProductId(UUID productId);
}
