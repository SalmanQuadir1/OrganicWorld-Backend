package com.ecom.Ecommerce.DTO;

import java.util.List;

public class SellerRequestDTO {
    private String sellerName;
    private String email;
    private String phone;
    private String gstNumber;
    private String businessType;
    private String description;
    private List<SellerAddressDTO> addresses;
    private List<SellerBankDetailsDTO> bankDetails;
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
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
    
    
    

    
}
