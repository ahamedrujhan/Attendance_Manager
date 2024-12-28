package com.example.attendence_manager_new.gym.common.model;

import com.example.attendence_manager_new.gym.model.Gym;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "gym_group")
public class GymGroup {
    @Id
    private Long id;
    private String gymGroupName;
    private String description;
    private String country;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String userId;

    @Transient
    List<Gym> gyms;

    @Transient
    List<Images> images;

    public static class Address {

    }
}
