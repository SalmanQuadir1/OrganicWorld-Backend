package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.SellerDTO;
import java.util.List;
import java.util.UUID;

public interface SellerService {
    SellerDTO createSeller(SellerDTO dto);
    SellerDTO getSellerById(UUID sellerId);
    List<SellerDTO> getAllSellers();
    SellerDTO updateSeller(UUID sellerId, SellerDTO dto);
    void deleteSeller(UUID sellerId);

    // Business methods
    List<SellerDTO> getSellersByStatus(String status); // e.g., active/inactive
}
