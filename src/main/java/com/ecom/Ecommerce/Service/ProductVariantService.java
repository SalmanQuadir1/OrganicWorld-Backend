package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.ProductVariantDTO;

import java.util.List;
import java.util.UUID;

public interface ProductVariantService {

    ProductVariantDTO createVariant(ProductVariantDTO dto);

    ProductVariantDTO getVariantById(UUID variantId);

    List<ProductVariantDTO> getVariantsByProductId(UUID productId);

    ProductVariantDTO updateVariant(UUID variantId, ProductVariantDTO dto);

    void deleteVariant(UUID variantId);
}
