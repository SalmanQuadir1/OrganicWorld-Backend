package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.InventoryDTO;

import java.util.List;
import java.util.UUID;

public interface InventoryService {

    // CRUD operations
    InventoryDTO createInventory(InventoryDTO inventoryDTO);
    InventoryDTO getInventoryById(UUID inventoryId);
    List<InventoryDTO> getAllInventory();
    InventoryDTO updateInventory(UUID inventoryId, InventoryDTO inventoryDTO);
    void deleteInventory(UUID inventoryId);

    // Business logic
    boolean reduceStock(UUID variantId, int quantity);
    InventoryDTO getInventoryByVariantAndSeller(UUID variantId, UUID sellerId);
    List<InventoryDTO> getInventoryBySeller(UUID sellerId);   // Added for controller support
}
