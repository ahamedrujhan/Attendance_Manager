package com.example.attendence_manager_new.gym.configuration.mapper;

import com.example.attendence_manager_new.gym.model.GymHours;
import com.example.attendence_manager_new.gym.model.dto.GymCreateDTO;
import com.example.attendence_manager_new.gym.model.dto.GymHoursCreateDTO;

public class GymHoursMapper {
    public static GymHours gymHoursCreateDTOToGymHours (GymHoursCreateDTO gymHoursCreateDTO) {
        GymHours gymHours = new GymHours();
        gymHours.setDay(gymHoursCreateDTO.getDay());
        gymHours.setOpenTime(gymHoursCreateDTO.getOpenTime());
        gymHours.setCloseTime(gymHoursCreateDTO.getCloseTime());
        gymHours.setOffDay(gymHoursCreateDTO.isOffDay());
        gymHours.setCreatedBy(gymHours.getCreatedBy());
        gymHours.setUpdatedBy(gymHours.getUpdatedBy());

        return gymHours;
    }
}
