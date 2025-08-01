package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.BrandDTO;
import com.ecom.Ecommerce.Entity.Brand;
import com.ecom.Ecommerce.Repository.BrandRepository;
import com.ecom.Ecommerce.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public BrandDTO createBrand(BrandDTO brandDTO) {
        Brand brand = new Brand();
        brand.setName(brandDTO.getName());
        brand.setLogoUrl(brandDTO.getLogoUrl());
        brand.setCreatedAt(new Date());
        brand.setUpdatedAt(new Date());
        brand = brandRepository.save(brand);
        return convertToDTO(brand);
    }

    @Override
    public BrandDTO getBrandById(UUID brandId) {
        Brand brand = brandRepository.findById(brandId)
                .orElseThrow(() -> new RuntimeException("Brand not found"));
        return convertToDTO(brand);
    }

    @Override
    public List<BrandDTO> getAllBrands() {
        return brandRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BrandDTO updateBrand(UUID brandId, BrandDTO brandDTO) {
        Brand brand = brandRepository.findById(brandId)
                .orElseThrow(() -> new RuntimeException("Brand not found"));
        brand.setName(brandDTO.getName());
        brand.setLogoUrl(brandDTO.getLogoUrl());
        brand.setUpdatedAt(new Date());
        return convertToDTO(brandRepository.save(brand));
    }

    @Override
    public void deleteBrand(UUID brandId) {
        brandRepository.deleteById(brandId);
    }

    private BrandDTO convertToDTO(Brand brand) {
        BrandDTO dto = new BrandDTO();
        dto.setBrandId(brand.getBrandId());
        dto.setName(brand.getName());
        dto.setLogoUrl(brand.getLogoUrl());
        dto.setCreatedAt(brand.getCreatedAt());
        dto.setUpdatedAt(brand.getUpdatedAt());
        return dto;
    }
}
