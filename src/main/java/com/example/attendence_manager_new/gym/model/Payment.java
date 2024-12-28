package com.example.attendence_manager_new.gym.model;

import com.example.attendence_manager_new.gym.model.enums.PaymentMethod;
import com.example.attendence_manager_new.gym.model.enums.PaymentStatus;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payment")
public class Payment {
    @Id
    private Long id;
    private UUID subscriptionUserId; //keycloak user id
    private String subscriptionUserName;
    private Long subscriptionPlanId;
    private String subscriptionPlanName;
    private Float amountPaid;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;
    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
