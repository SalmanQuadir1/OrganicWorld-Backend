package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface BrandRepository extends JpaRepository<Brand, UUID> {}
