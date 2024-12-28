package com.example.attendence_manager_new.gym.repository;

import com.example.attendence_manager_new.gym.common.model.GymGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymGroupRepository extends JpaRepository<GymGroup, Long> {
}
