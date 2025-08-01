package com.ecom.Ecommerce.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.*;

@Entity
public class CartItem {

    @Id
    @GeneratedValue
    private UUID cartItemId;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private Inventory inventory; // Seller-specific product variant

    private int quantity;
    private BigDecimal priceAtAddition;
    private Date addedAt;

    // Getters & Setters
    public UUID getCartItemId() { return cartItemId; }
    public void setCartItemId(UUID cartItemId) { this.cartItemId = cartItemId; }

    public Cart getCart() { return cart; }
    public void setCart(Cart cart) { this.cart = cart; }

    public Inventory getInventory() { return inventory; }
    public void setInventory(Inventory inventory) { this.inventory = inventory; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public BigDecimal getPriceAtAddition() { return priceAtAddition; }
    public void setPriceAtAddition(BigDecimal priceAtAddition) { this.priceAtAddition = priceAtAddition; }

    public Date getAddedAt() { return addedAt; }
    public void setAddedAt(Date addedAt) { this.addedAt = addedAt; }
}
