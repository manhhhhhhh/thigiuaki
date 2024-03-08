package org.example.bai1.repository;

import org.example.bai1.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<Staff,Integer> {
}