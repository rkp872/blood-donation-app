package com.donate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donate.entity.BloodGroup;

public interface BloodGroupRepository extends JpaRepository<BloodGroup,Long> {
    
}
