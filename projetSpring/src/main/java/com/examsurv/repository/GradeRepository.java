package com.examsurv.repository;

import com.examsurv.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GradeRepository extends JpaRepository<Grade, Integer> {
}