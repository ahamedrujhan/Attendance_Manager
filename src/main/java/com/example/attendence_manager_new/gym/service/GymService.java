package com.example.attendence_manager_new.gym.service;

import com.example.attendence_manager_new.gym.model.Gym;
import com.example.attendence_manager_new.gym.model.dto.GymCreateDTO;

import java.util.List;

public interface GymService {
    List<Gym> getAllGyms();
    Gym createGym(Long gymGroupId, GymCreateDTO gymCreateDTO);
    Gym getGymById(Long gymId);
    List<Gym> getAllGymByGroupId(Long gymGroupId);
    Gym updateGym(Long gymId, GymCreateDTO gymCreateDTO);
    void deleteGym(Long gymId);
}
