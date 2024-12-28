package com.example.attendence_manager_new.gym.repository;

import com.example.attendence_manager_new.gym.model.GymHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymHoursRepository extends JpaRepository<GymHours,Long> {
}
