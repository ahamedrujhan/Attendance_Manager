package com.example.attendence_manager_new.gym.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "subscriptions")
public class Subscription {
    @Id
    private Long id;
    private String subscriptionName;
    private String description;
    private Float price;
    private int duration;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long gymId;
}
