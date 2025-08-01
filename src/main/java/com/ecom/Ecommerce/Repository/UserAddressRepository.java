package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserAddressRepository extends JpaRepository<UserAddress, UUID> {}
