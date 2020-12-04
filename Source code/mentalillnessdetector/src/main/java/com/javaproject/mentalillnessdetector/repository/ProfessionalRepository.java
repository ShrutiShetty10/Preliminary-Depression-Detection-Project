package com.javaproject.mentalillnessdetector.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaproject.mentalillnessdetector.model.Professional;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Long>
{

}