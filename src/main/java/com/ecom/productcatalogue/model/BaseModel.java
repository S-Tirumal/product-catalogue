package com.ecom.productcatalogue.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id
    private Long id;

    private Date createdAt;

    private Date lastUpdatedAt;

    private State state;
}
