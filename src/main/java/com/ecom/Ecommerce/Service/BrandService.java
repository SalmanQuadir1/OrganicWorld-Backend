package com.ecom.Ecommerce.Service;

import com.ecom.Ecommerce.DTO.BrandDTO;

import java.util.List;
import java.util.UUID;

public interface BrandService {
    BrandDTO createBrand(BrandDTO brandDTO);
    BrandDTO getBrandById(UUID brandId);
    List<BrandDTO> getAllBrands();
    BrandDTO updateBrand(UUID brandId, BrandDTO brandDTO);
    void deleteBrand(UUID brandId);
}
