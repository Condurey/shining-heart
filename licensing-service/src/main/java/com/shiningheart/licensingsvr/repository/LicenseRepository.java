package com.shiningheart.licensingsvr.repository;


import com.shiningheart.licensingsvr.model.License;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LicenseRepository {

    List<License> findByOrganizationId(String organizationId);

    License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);

    void save(License license);

    void delete(String licenseId);
}
