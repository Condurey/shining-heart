package com.shiningheart.organization.repository;


import com.shiningheart.organization.model.Organization;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrganizationRepository {

    Organization findById(String id);

    void save(Organization org);

    void delete(String id);
}
