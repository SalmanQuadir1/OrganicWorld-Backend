package com.ecom.Ecommerce.DTO;

import java.util.List;
import java.util.UUID;

public class SellerResponseDTO {
    private UUID sellerId;
    private String sellerName;
    private String email;
    private String phone;
    private double rating;
    private List<SellerAddressDTO> addresses;
    private List<SellerBankDetailsDTO> bankDetails;
	public UUID getSellerId() {
		return sellerId;
	}
	public void setSellerId(UUID sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public List<SellerAddressDTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<SellerAddressDTO> addresses) {
		this.addresses = addresses;
	}
	public List<SellerBankDetailsDTO> getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(List<SellerBankDetailsDTO> bankDetails) {
		this.bankDetails = bankDetails;
	}

    // Getters & Setters
}
