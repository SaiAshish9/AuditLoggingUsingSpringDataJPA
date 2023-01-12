package com.spring.AuditLogging.service;

import com.spring.AuditLogging.entity.Attendance;
import com.spring.AuditLogging.repository.AttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    @Autowired
    private AttendanceRepo attendanceRepo;

    public Attendance saveAttendance(Attendance attendance) {

        return attendanceRepo.save(attendance);

    }
}
