package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.InventoryDTO;
import com.ecom.Ecommerce.Entity.Inventory;
import com.ecom.Ecommerce.Entity.ProductVariant;
import com.ecom.Ecommerce.Entity.Seller;
import com.ecom.Ecommerce.Repository.InventoryRepository;
import com.ecom.Ecommerce.Repository.ProductVariantRepository;
import com.ecom.Ecommerce.Repository.SellerRepository;
import com.ecom.Ecommerce.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ProductVariantRepository productVariantRepository;

    // Entity → DTO
    private InventoryDTO toDTO(Inventory inventory) {
        InventoryDTO dto = new InventoryDTO();
        dto.setInventoryId(inventory.getInventoryId());
        dto.setSellerId(inventory.getSeller().getSellerId());
        dto.setProductVariantId(inventory.getProductVariant().getVariantId());
        dto.setPrice(inventory.getPrice());
        dto.setQuantityAvailable(inventory.getQuantityAvailable());
        dto.setSellerSku(inventory.getSellerSku());
        dto.setMinOrderQuantity(inventory.getMinOrderQuantity());
        dto.setMaxOrderQuantity(inventory.getMaxOrderQuantity());
        dto.setCreatedAt(inventory.getCreatedAt());
        dto.setUpdatedAt(inventory.getUpdatedAt());
        dto.setStatus(inventory.getStatus());
        return dto;
    }

    // DTO → Entity
    private Inventory toEntity(InventoryDTO dto) {
        Inventory inventory = new Inventory();
        inventory.setInventoryId(dto.getInventoryId());

        Seller seller = sellerRepository.findById(dto.getSellerId())
                .orElseThrow(() -> new RuntimeException("Seller not found"));
        inventory.setSeller(seller);

        ProductVariant variant = productVariantRepository.findById(dto.getProductVariantId())
                .orElseThrow(() -> new RuntimeException("Variant not found"));
        inventory.setProductVariant(variant);

        inventory.setPrice(dto.getPrice());
        inventory.setQuantityAvailable(dto.getQuantityAvailable());
        inventory.setSellerSku(dto.getSellerSku());
        inventory.setMinOrderQuantity(dto.getMinOrderQuantity());
        inventory.setMaxOrderQuantity(dto.getMaxOrderQuantity());
        inventory.setCreatedAt(dto.getCreatedAt() != null ? dto.getCreatedAt() : new Date());
        inventory.setUpdatedAt(new Date());
        inventory.setStatus(dto.getStatus());

        return inventory;
    }

    @Override
    public InventoryDTO createInventory(InventoryDTO inventoryDTO) {
        Inventory inventory = toEntity(inventoryDTO);
        inventoryRepository.save(inventory);
        return toDTO(inventory);
    }

    @Override
    public InventoryDTO getInventoryById(UUID inventoryId) {
        return inventoryRepository.findById(inventoryId)
                .map(this::toDTO)
                .orElse(null);
    }

    @Override
    public List<InventoryDTO> getAllInventory() {
        return inventoryRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public InventoryDTO updateInventory(UUID inventoryId, InventoryDTO inventoryDTO) {
        return inventoryRepository.findById(inventoryId)
                .map(existing -> {
                    existing.setPrice(inventoryDTO.getPrice());
                    existing.setQuantityAvailable(inventoryDTO.getQuantityAvailable());
                    existing.setSellerSku(inventoryDTO.getSellerSku());
                    existing.setMinOrderQuantity(inventoryDTO.getMinOrderQuantity());
                    existing.setMaxOrderQuantity(inventoryDTO.getMaxOrderQuantity());
                    existing.setUpdatedAt(new Date());
                    existing.setStatus(inventoryDTO.getStatus());
                    inventoryRepository.save(existing);
                    return toDTO(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteInventory(UUID inventoryId) {
        inventoryRepository.deleteById(inventoryId);
    }

    @Override
    public boolean reduceStock(UUID variantId, int quantity) {
        Inventory inventory = inventoryRepository.findByProductVariant_VariantId(variantId)
                .orElseThrow(() -> new RuntimeException("Inventory not found"));

        if (inventory.getQuantityAvailable() >= quantity) {
            inventory.setQuantityAvailable(inventory.getQuantityAvailable() - quantity);
            inventory.setUpdatedAt(new Date());
            inventoryRepository.save(inventory);
            return true;
        }
        return false;
    }

    @Override
    public InventoryDTO getInventoryByVariantAndSeller(UUID variantId, UUID sellerId) {
        return inventoryRepository.findByProductVariant_VariantIdAndSeller_SellerId(variantId, sellerId)
                .map(this::toDTO)
                .orElse(null);
    }

    @Override
    public List<InventoryDTO> getInventoryBySeller(UUID sellerId) {
        List<Inventory> inventories = inventoryRepository.findBySeller_SellerId(sellerId);

        return inventories.stream().map(inventory -> {
            InventoryDTO dto = new InventoryDTO();
            dto.setInventoryId(inventory.getInventoryId());
            dto.setSellerId(inventory.getSeller().getSellerId());
            dto.setProductVariantId(inventory.getProductVariant().getVariantId());
            dto.setPrice(inventory.getPrice());
            dto.setQuantityAvailable(inventory.getQuantityAvailable());
            dto.setSellerSku(inventory.getSellerSku());
            dto.setMinOrderQuantity(inventory.getMinOrderQuantity());
            dto.setMaxOrderQuantity(inventory.getMaxOrderQuantity());
            dto.setCreatedAt(inventory.getCreatedAt());
            dto.setUpdatedAt(inventory.getUpdatedAt());
            dto.setStatus(inventory.getStatus());
            return dto;
        }).collect(Collectors.toList());
    }



}
