package com.springjava.poc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.poc.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,
Integer> {
    
}
