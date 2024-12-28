package com.example.attendence_manager_new.gym.model;

import com.example.attendence_manager_new.gym.model.enums.Gender;
import com.example.attendence_manager_new.gym.model.enums.SubscriptionStatus;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subscription_user")
public class SubscriptionUser {

    @Id
    private Long id;
    private UUID subscriptionUserId; //keycloak user id
    private boolean isMobileUser;
    private Long gymGroupId;
    private Long gymId;
    private String gymName;
    private Long subscriptionId;
    private String subscriptionName;
    private String userName;
    private Gender gender;
    private String email;
    private String phone;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private SubscriptionStatus subscriptionStatus;
    private LocalDate lastPaymentDate;
    private LocalDate startDate;
    private LocalDate endDate;
}
