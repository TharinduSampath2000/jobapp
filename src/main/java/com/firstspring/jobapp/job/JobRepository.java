package com.firstspring.jobapp.job;

import com.firstspring.jobapp.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
