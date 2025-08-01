package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.ProductVariantDTO;
import com.ecom.Ecommerce.Entity.Product;
import com.ecom.Ecommerce.Entity.ProductVariant;
import com.ecom.Ecommerce.Repository.ProductRepository;
import com.ecom.Ecommerce.Repository.ProductVariantRepository;
import com.ecom.Ecommerce.Service.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductVariantServiceImpl implements ProductVariantService {

    @Autowired
    private ProductVariantRepository productVariantRepository;

    @Autowired
    private ProductRepository productRepository;

    // Convert Entity → DTO
    private ProductVariantDTO toDTO(ProductVariant variant) {
        ProductVariantDTO dto = new ProductVariantDTO();
        dto.setVariantId(variant.getVariantId());
        dto.setProductId(variant.getProduct().getProductId());
        dto.setVariantName(variant.getVariantName());
        dto.setSku(variant.getSku());
        dto.setAttributes(variant.getAttributes());
        dto.setWeight(variant.getWeight());
        dto.setDimensions(variant.getDimensions());
        dto.setCreatedAt(variant.getCreatedAt());
        dto.setUpdatedAt(variant.getUpdatedAt());
        return dto;
    }

    // Convert DTO → Entity
    private ProductVariant toEntity(ProductVariantDTO dto) {
        ProductVariant variant = new ProductVariant();

        if (dto.getVariantId() != null) {
            variant.setVariantId(dto.getVariantId());
        }

        Product product = productRepository.findById(dto.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        variant.setProduct(product);
        variant.setVariantName(dto.getVariantName());
        variant.setSku(dto.getSku());
        variant.setAttributes(dto.getAttributes());
        variant.setWeight(dto.getWeight());
        variant.setDimensions(dto.getDimensions());
        variant.setCreatedAt(dto.getCreatedAt() != null ? dto.getCreatedAt() : new Date());
        variant.setUpdatedAt(new Date());

        return variant;
    }

    @Override
    public ProductVariantDTO createVariant(ProductVariantDTO dto) {
        ProductVariant variant = toEntity(dto);
        productVariantRepository.save(variant);
        return toDTO(variant);
    }

    @Override
    public ProductVariantDTO getVariantById(UUID variantId) {
        return productVariantRepository.findById(variantId)
                .map(this::toDTO)
                .orElse(null);
    }

    @Override
    public List<ProductVariantDTO> getVariantsByProductId(UUID productId) {
        return productVariantRepository.findByProduct_ProductId(productId)
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductVariantDTO updateVariant(UUID variantId, ProductVariantDTO dto) {
        return productVariantRepository.findById(variantId)
                .map(existing -> {
                    existing.setVariantName(dto.getVariantName());
                    existing.setSku(dto.getSku());
                    existing.setAttributes(dto.getAttributes());
                    existing.setWeight(dto.getWeight());
                    existing.setDimensions(dto.getDimensions());
                    existing.setUpdatedAt(new Date());
                    productVariantRepository.save(existing);
                    return toDTO(existing);
                })
                .orElse(null);
    }

    @Override
    public void deleteVariant(UUID variantId) {
        productVariantRepository.deleteById(variantId);
    }
}
