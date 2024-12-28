package com.example.attendence_manager_new.gym.repository;

import com.example.attendence_manager_new.gym.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym,Long> {
}
