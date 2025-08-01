package com.ecom.Ecommerce.Entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue
    private UUID wishlistId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Date addedAt;

    // Getters & Setters
    public UUID getWishlistId() { return wishlistId; }
    public void setWishlistId(UUID wishlistId) { this.wishlistId = wishlistId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Date getAddedAt() { return addedAt; }
    public void setAddedAt(Date addedAt) { this.addedAt = addedAt; }
}
