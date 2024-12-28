package com.example.attendence_manager_new.gym.configuration.mapper;

import com.example.attendence_manager_new.gym.model.Gym;
import com.example.attendence_manager_new.gym.model.dto.GymCreateDTO;

public class GymMapper {
    public static Gym gymCreateDTOtoGym (GymCreateDTO gymCreateDTO) {
        return Gym.builder()
                .gymName(gymCreateDTO.getGymName())
                .gymType(gymCreateDTO.getGymType())
                .number(gymCreateDTO.getNumber())
                .street(gymCreateDTO.getStreet())
                .city(gymCreateDTO.getCity())
                .state(gymCreateDTO.getState())
                .country(gymCreateDTO.getCountry())
                .postalCode(gymCreateDTO.getPostalCode())
                .description(gymCreateDTO.getDescription())
                .accountHolderName(gymCreateDTO.getAccountHolderName())
                .accountNumber(gymCreateDTO.getAccountNumber())
                .bankName(gymCreateDTO.getBankName())
                .branchBankName(gymCreateDTO.getBranchBankName())
                .swiftCode(gymCreateDTO.getSwiftCode())
                .createdBy(gymCreateDTO.getCreatedBy())
                .updatedBy(gymCreateDTO.getUpdatedBy())
                .build();
    }
}
