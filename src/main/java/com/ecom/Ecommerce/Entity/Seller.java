package com.ecom.Ecommerce.Entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Seller {

    @Id
    @GeneratedValue
    private UUID sellerId;

    private String sellerName;
    private String email;
    private String phone;
    private String gstNumber;
    private String businessType;
    private String description;

    private double rating;
    private Date joinedAt;
    private String status; // ACTIVE, SUSPENDED

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<SellerAddress> addresses;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<SellerBankDetails> bankDetails;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Inventory> inventories;

    // Getters and Setters
    public UUID getSellerId() { return sellerId; }
    public void setSellerId(UUID sellerId) { this.sellerId = sellerId; }

    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) { this.sellerName = sellerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getGstNumber() { return gstNumber; }
    public void setGstNumber(String gstNumber) { this.gstNumber = gstNumber; }

    public String getBusinessType() { return businessType; }
    public void setBusinessType(String businessType) { this.businessType = businessType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public Date getJoinedAt() { return joinedAt; }
    public void setJoinedAt(Date joinedAt) { this.joinedAt = joinedAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<SellerAddress> getAddresses() { return addresses; }
    public void setAddresses(List<SellerAddress> addresses) { this.addresses = addresses; }

    public List<SellerBankDetails> getBankDetails() { return bankDetails; }
    public void setBankDetails(List<SellerBankDetails> bankDetails) { this.bankDetails = bankDetails; }

    public List<Inventory> getInventories() { return inventories; }
    public void setInventories(List<Inventory> inventories) { this.inventories = inventories; }
}
