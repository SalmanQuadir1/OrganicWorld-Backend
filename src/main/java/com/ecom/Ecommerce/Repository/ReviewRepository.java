package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {}
