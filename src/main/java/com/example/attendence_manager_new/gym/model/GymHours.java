package com.example.attendence_manager_new.gym.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gym_hours")
public class GymHours {
    @Id
    private Long id;
    private String day;
    private LocalTime openTime;
    private LocalTime closeTime;
    private boolean isOffDay;
    private Long gymId;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
