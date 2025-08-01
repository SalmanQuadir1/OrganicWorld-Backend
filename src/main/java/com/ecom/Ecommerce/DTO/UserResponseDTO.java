package com.ecom.Ecommerce.DTO;

import java.util.List;
import java.util.UUID;

public class UserResponseDTO {
    private UUID userId;
    private String fullName;
    private String email;
    private String phone;
    private String role;
    private List<UserAddressDTO> addresses;
    
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<UserAddressDTO> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<UserAddressDTO> addresses) {
		this.addresses = addresses;
	}
}
   
