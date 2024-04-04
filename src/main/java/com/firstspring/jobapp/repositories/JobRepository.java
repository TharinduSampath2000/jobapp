package com.firstspring.jobapp.repositories;

import com.firstspring.jobapp.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}