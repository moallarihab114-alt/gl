package com.examsurv.repository;

import com.examsurv.entity.Matiere;
import com.examsurv.entity.MatiereId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepository extends JpaRepository<Matiere, MatiereId> {
}
