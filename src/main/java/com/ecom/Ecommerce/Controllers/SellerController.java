package com.ecom.Ecommerce.Controllers;

import com.ecom.Ecommerce.DTO.SellerDTO;
import com.ecom.Ecommerce.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping
    public ResponseEntity<SellerDTO> createSeller(@RequestBody SellerDTO dto) {
        return ResponseEntity.ok(sellerService.createSeller(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SellerDTO> getSeller(@PathVariable UUID id) {
        return ResponseEntity.ok(sellerService.getSellerById(id));
    }

    @GetMapping
    public ResponseEntity<List<SellerDTO>> getAllSellers() {
        return ResponseEntity.ok(sellerService.getAllSellers());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SellerDTO> updateSeller(@PathVariable UUID id, @RequestBody SellerDTO dto) {
        return ResponseEntity.ok(sellerService.updateSeller(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSeller(@PathVariable UUID id) {
        sellerService.deleteSeller(id);
        return ResponseEntity.noContent().build();
    }
}
