package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.SellerBankDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface SellerBankDetailsRepository extends JpaRepository<SellerBankDetails, UUID> {}
