package com.spring.AuditLogging.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@IdClass(AttendanceID.class)
@Table(name="attendance", schema="postgres")
@NoArgsConstructor
@Data
public class Attendance extends AuditableBase implements Serializable {

    private static final long serialVersionUID = 81024225062716935L;

    @Id
    @Column(name="emp_id")
    private Integer empId;

    @Id
    @Column(name="effective_dt")
    private LocalDate effectiveDt;

    @Column(name="fl_present")
    private boolean present;

}
