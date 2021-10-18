package com.kpsec.clienttargetservice.repository;

import com.kpsec.clienttargetservice.model.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}
