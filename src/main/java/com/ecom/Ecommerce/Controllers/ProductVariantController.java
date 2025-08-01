package com.ecom.Ecommerce.Controllers;

import com.ecom.Ecommerce.DTO.ProductVariantDTO;
import com.ecom.Ecommerce.Service.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/variants")
public class ProductVariantController {

    @Autowired
    private ProductVariantService productVariantService;

    @PostMapping
    public ResponseEntity<ProductVariantDTO> createVariant(@RequestBody ProductVariantDTO dto) {
        return ResponseEntity.ok(productVariantService.createVariant(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductVariantDTO> getVariant(@PathVariable UUID id) {
        return ResponseEntity.ok(productVariantService.getVariantById(id));
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<ProductVariantDTO>> getVariantsByProduct(@PathVariable UUID productId) {
        return ResponseEntity.ok(productVariantService.getVariantsByProductId(productId));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductVariantDTO> updateVariant(@PathVariable UUID id, @RequestBody ProductVariantDTO dto) {
        return ResponseEntity.ok(productVariantService.updateVariant(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVariant(@PathVariable UUID id) {
        productVariantService.deleteVariant(id);
        return ResponseEntity.noContent().build();
    }
}
