package com.liveasy.loadsapi.repositories;

import com.liveasy.loadsapi.models.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long> {
}
