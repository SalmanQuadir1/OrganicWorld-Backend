package com.ecom.Ecommerce.DTO;

import java.util.List;

public class UserRequestDTO {
    private String fullName;
    private String email;
    private String phone;
    private String password;
    private String role;
    private List<UserAddressDTO> addresses;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
