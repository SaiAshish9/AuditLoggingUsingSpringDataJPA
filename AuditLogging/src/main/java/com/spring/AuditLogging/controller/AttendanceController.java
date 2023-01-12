package com.spring.AuditLogging.controller;

import com.spring.AuditLogging.entity.Attendance;
import com.spring.AuditLogging.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping(value="/jpaAudit/attendance")
    public ResponseEntity<Attendance> saveAttendance(@RequestBody Attendance attendace){

        return new ResponseEntity<>(attendanceService.saveAttendance(attendace), HttpStatus.OK);
    }
}
