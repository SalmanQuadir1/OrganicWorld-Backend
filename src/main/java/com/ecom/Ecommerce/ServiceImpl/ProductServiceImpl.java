package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.ProductDTO;
import com.ecom.Ecommerce.Entity.Product;
import com.ecom.Ecommerce.Repository.ProductRepository;
import com.ecom.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Convert Entity → DTO
    private ProductDTO convertToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setProductId(product.getProductId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setModel(product.getModel());
        dto.setSubCategory(product.getSubCategory());
        dto.setBrand(product.getBrand());
        dto.setMainImageUrl(product.getMainImageUrl());
        dto.setThumbnailUrl(product.getThumbnailUrl());
        dto.setCreatedAt(product.getCreatedAt());
        dto.setUpdatedAt(product.getUpdatedAt());
        dto.setStatus(product.getStatus());
        dto.setVariants(product.getVariants());
        return dto;
    }

    // Convert DTO → Entity
    private Product convertToEntity(ProductDTO dto) {
        Product product = new Product();
        product.setProductId(dto.getProductId());
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setModel(dto.getModel());
        product.setSubCategory(dto.getSubCategory());
        product.setBrand(dto.getBrand());
        product.setMainImageUrl(dto.getMainImageUrl());
        product.setThumbnailUrl(dto.getThumbnailUrl());
        product.setCreatedAt(dto.getCreatedAt());
        product.setUpdatedAt(dto.getUpdatedAt());
        product.setStatus(dto.getStatus());
        product.setVariants(dto.getVariants());
        return product;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = convertToEntity(productDTO);
        productRepository.save(product);
        return convertToDTO(product);
    }

    @Override
    public ProductDTO getProductById(UUID productId) {
        return productRepository.findById(productId)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO updateProduct(UUID productId, ProductDTO productDTO) {
        return productRepository.findById(productId)
                .map(existing -> {
                    existing.setName(productDTO.getName());
                    existing.setDescription(productDTO.getDescription());
                    existing.setModel(productDTO.getModel());
                    existing.setSubCategory(productDTO.getSubCategory());
                    existing.setBrand(productDTO.getBrand());
                    existing.setMainImageUrl(productDTO.getMainImageUrl());
                    existing.setThumbnailUrl(productDTO.getThumbnailUrl());
                    existing.setUpdatedAt(productDTO.getUpdatedAt());
                    existing.setStatus(productDTO.getStatus());
                    existing.setVariants(productDTO.getVariants());
                    productRepository.save(existing);
                    return convertToDTO(existing);
                }).orElse(null);
    }

    @Override
    public void deleteProduct(UUID productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<ProductDTO> getProductsBySubCategory(UUID subCategoryId) {
        return productRepository.findBySubCategory_SubCategoryId(subCategoryId)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> getProductsByBrand(UUID brandId) {
        return productRepository.findByBrand_BrandId(brandId)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDTO> searchProducts(String keyword) {
        return productRepository.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword)
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
