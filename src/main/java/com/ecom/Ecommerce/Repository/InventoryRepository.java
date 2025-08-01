package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface InventoryRepository extends JpaRepository<Inventory, UUID> {

    // Find by variant (single inventory record)
    Optional<Inventory> findByProductVariant_VariantId(UUID variantId);

    // Find by variant + seller (single inventory record)
    Optional<Inventory> findByProductVariant_VariantIdAndSeller_SellerId(UUID variantId, UUID sellerId);

    // Find all inventory records for a seller
    List<Inventory> findBySeller_SellerId(UUID sellerId);
}
