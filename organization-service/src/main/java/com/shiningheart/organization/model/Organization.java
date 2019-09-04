package com.shiningheart.organization.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Organization implements Serializable {

    private static final long serialVersionUID = -5693143673952889363L;

    String id;

    String name;

    String contactName;

    String contactEmail;

    String contactPhone;


}
