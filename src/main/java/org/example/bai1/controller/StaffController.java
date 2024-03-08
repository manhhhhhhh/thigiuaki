package org.example.bai1.controller;

import org.example.bai1.model.Staff;
import org.example.bai1.service.IStaffService;
import org.example.bai1.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Staffs")

public class StaffController {

    @Autowired
    IStaffService iStudentService;
    @GetMapping("")
    public ResponseEntity<Iterable<Staff>> getAllStaff(){
        Iterable<Staff> staffIterable = iStudentService.findAll();
        return new ResponseEntity<>(staffIterable, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> findStaffById(@PathVariable int id) {
        Optional<Staff> staffOptional = iStudentService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staffOptional.get(), HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff ){
        iStudentService.save(staff);
        return new ResponseEntity<>(staff,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable int id, @RequestBody Staff staff) {
        Optional<Staff> staff1Optional = iStudentService.findById(id);
        if (!staff1Optional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        staff.setId(staff1Optional.get().getId());
        return new ResponseEntity<>(iStudentService.save(staff), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteStaffById(@PathVariable("id") int id){
        Optional<Staff> staff = iStudentService.findById(id);
        iStudentService.remove(staff.get().getId());
        return new ResponseEntity<>(staff.get(),HttpStatus.OK);
    }
}