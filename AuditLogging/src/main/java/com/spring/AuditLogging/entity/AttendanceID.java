package com.spring.AuditLogging.entity;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AttendanceID implements Serializable {

    @Column(name="emp_id")
    private Integer empId;

    @Column(name="effective_dt")
    private LocalDate effectiveDt;
}

