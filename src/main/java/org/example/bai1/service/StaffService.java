package org.example.bai1.service;

import org.example.bai1.model.Staff;
import org.example.bai1.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StaffService implements IStaffService {

@Autowired
    StaffRepository staffRepository;
    @Override
    public Iterable<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Optional<Staff> findById(int id) {
        return staffRepository.findById(id);
    }


    @Override
    public Staff save(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public void remove(int id) {
       staffRepository.deleteById(id);
    }
}
