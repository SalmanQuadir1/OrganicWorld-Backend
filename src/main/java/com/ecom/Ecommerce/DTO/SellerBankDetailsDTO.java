package com.ecom.Ecommerce.DTO;

import java.util.UUID;

public class SellerBankDetailsDTO {
    private UUID bankId;
    private String bankName;
    private String accountNumber;
    private String ifscCode;
    private String branchName;
    private String accountType; // Savings / Current

    // Getters & Setters
    public UUID getBankId() {
        return bankId;
    }
    public void setBankId(UUID bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
