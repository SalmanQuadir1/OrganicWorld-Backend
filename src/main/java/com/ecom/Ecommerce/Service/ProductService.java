package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.ProductDTO;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    // CRUD Operations
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductById(UUID productId);
    List<ProductDTO> getAllProducts();
    ProductDTO updateProduct(UUID productId, ProductDTO productDTO);
    void deleteProduct(UUID productId);

    // Business Methods
    List<ProductDTO> getProductsBySubCategory(UUID subCategoryId);
    List<ProductDTO> getProductsByBrand(UUID brandId);
    List<ProductDTO> searchProducts(String keyword); // name/description search
}
