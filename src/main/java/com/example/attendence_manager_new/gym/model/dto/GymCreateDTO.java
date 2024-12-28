package com.example.attendence_manager_new.gym.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GymCreateDTO {
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
    //createdAt and updatedAt will be creating time stamp
    private List<GymHoursCreateDTO> gymHoursCreateDTOList;
    //coordinates in future...
}
