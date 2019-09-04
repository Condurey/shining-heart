package com.shiningheart.licensingsvr.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class License implements Serializable {

    private static final long serialVersionUID = -4125372607401094292L;

    private String licenseId;

    private String organizationId;

    private String organizationName = "";

    private String contactName = "";

    private String contactPhone = "";

    private String contactEmail = "";

    private String productName;

    private String licenseType;

    private Integer licenseMax;

    private Integer licenseAllocated;

    private String comment;


    public License withId(String id) {
        this.setLicenseId(id);
        return this;
    }

    public License withOrganizationId(String organizationId) {
        this.setOrganizationId(organizationId);
        return this;
    }

    public License withProductName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType) {
        this.setLicenseType(licenseType);
        return this;
    }

    public License withLicenseMax(Integer licenseMax) {
        this.setLicenseMax(licenseMax);
        return this;
    }

    public License withLicenseAllocated(Integer licenseAllocated) {
        this.setLicenseAllocated(licenseAllocated);
        return this;
    }

    public License withComment(String comment) {
        this.setComment(comment);
        return this;
    }

    public License withOrganizationName(String organizationName) {
        this.setOrganizationName(organizationName);
        return this;
    }

    public License withContactName(String contactName) {
        this.setContactName(contactName);
        return this;
    }

    public License withContactPhone(String contactPhone) {
        this.setContactPhone(contactPhone);
        return this;
    }

    public License withContactEmail(String contactEmail) {
        this.setContactEmail(contactEmail);
        return this;
    }


}
