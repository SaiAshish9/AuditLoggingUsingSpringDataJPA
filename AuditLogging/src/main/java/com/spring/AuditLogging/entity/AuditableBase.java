package com.spring.AuditLogging.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

@MappedSuperclass
@Data
@EntityListeners(value = { AuditingEntityListener.class })
public abstract class AuditableBase {

    @CreatedBy
    @Column(name="created_by", updatable=false)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Timestamp createdAt;

    @CreatedDate
    @Column(name="created_dt", updatable =false)
    private Timestamp createdDt;

    @LastModifiedBy
    @Column(name="modified_by")
    private String modifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Timestamp modifiedAt;

    @LastModifiedDate
    @Column(name="modified_dt")
    private Timestamp modifiedDt;
}

