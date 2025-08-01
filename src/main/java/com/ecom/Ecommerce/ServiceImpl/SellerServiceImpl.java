package com.ecom.Ecommerce.ServiceImpl;

import com.ecom.Ecommerce.DTO.SellerDTO;
import com.ecom.Ecommerce.Entity.Seller;
import com.ecom.Ecommerce.Repository.SellerRepository;
import com.ecom.Ecommerce.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public SellerDTO createSeller(SellerDTO dto) {
        Seller seller = new Seller();
        seller.setDescription(dto.getBusinessName());
        seller.setEmail(dto.getEmail());
        seller.setPhone(dto.getPhone());
        seller.setGstNumber(dto.getGstNumber());
        seller.setStatus(dto.getStatus());
        sellerRepository.save(seller);
        return convertToDTO(seller);
    }

    @Override
    public SellerDTO getSellerById(UUID sellerId) {
        return sellerRepository.findById(sellerId)
                .map(this::convertToDTO)
                .orElse(null);
    }

    @Override
    public List<SellerDTO> getAllSellers() {
        return sellerRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SellerDTO updateSeller(UUID sellerId, SellerDTO dto) {
        return sellerRepository.findById(sellerId)
                .map(seller -> {
                    seller.setDescription(dto.getBusinessName());
                    seller.setPhone(dto.getPhone());
                    seller.setStatus(dto.getStatus());
                    sellerRepository.save(seller);
                    return convertToDTO(seller);
                }).orElse(null);
    }

    @Override
    public void deleteSeller(UUID sellerId) {
        sellerRepository.deleteById(sellerId);
    }

    @Override
    public List<SellerDTO> getSellersByStatus(String status) {
        return sellerRepository.findAll()
                .stream()
                .filter(s -> s.getStatus().equalsIgnoreCase(status))
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private SellerDTO convertToDTO(Seller seller) {
        SellerDTO dto = new SellerDTO();
        dto.setSellerId(seller.getSellerId());
        dto.setBusinessName(seller.getDescription());
        dto.setEmail(seller.getEmail());
        dto.setPhone(seller.getPhone());
        dto.setGstNumber(seller.getGstNumber());
        dto.setStatus(seller.getStatus());
        return dto;
    }
}
