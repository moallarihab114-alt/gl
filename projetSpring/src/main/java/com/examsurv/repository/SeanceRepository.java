package com.examsurv.repository;

import com.examsurv.entity.Seance;
import com.examsurv.entity.SeanceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends JpaRepository<Seance, SeanceId> {
}
