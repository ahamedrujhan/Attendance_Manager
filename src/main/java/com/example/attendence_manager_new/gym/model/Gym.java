package com.example.attendence_manager_new.gym.model;

import com.example.attendence_manager_new.gym.common.model.Images;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Entity(name = "Gym")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gym")
public class Gym {
    @Id
    private Long id;
    private String gymName;
    private String gymType;
    private String description;

    private String number;
    private String street;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    private String accountHolderName;
    private String accountNumber;
    private String bankName;
    private String branchBankName;
    private String swiftCode;
    private String createdBy;
    private String updatedBy;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Transient
    private List<GymHours> gymHours;

    @Transient
    private List<Images> images;

    @Transient
    private List<Subscription> subscriptions;

    private Long gymGroupId;
}
