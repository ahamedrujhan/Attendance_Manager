package com.example.attendence_manager_new.gym.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GymHoursCreateDTO {

    private String day;
    private LocalTime openTime;
    private LocalTime closeTime;
    private boolean isOffDay = false; // default value
    private String createdBy;
    private String updatedBy;
}
