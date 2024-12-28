package com.example.attendence_manager_new.gym.service;

import com.example.attendence_manager_new.exceptionhandling.exception.ResourceNotFoundException;
import com.example.attendence_manager_new.gym.common.model.GymGroup;
import com.example.attendence_manager_new.gym.configuration.mapper.GymHoursMapper;
import com.example.attendence_manager_new.gym.configuration.mapper.GymMapper;
import com.example.attendence_manager_new.gym.model.Gym;
import com.example.attendence_manager_new.gym.model.GymHours;
import com.example.attendence_manager_new.gym.model.dto.GymCreateDTO;
import com.example.attendence_manager_new.gym.repository.GymGroupRepository;
import com.example.attendence_manager_new.gym.repository.GymHoursRepository;
import com.example.attendence_manager_new.gym.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GymServiceImpl implements GymService{

    @Autowired
    private GymRepository gymRepository;

    @Autowired
    private GymGroupRepository gymGroupRepository;

    @Autowired
    private GymHoursRepository gymHoursRepository;


    @Override
    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    @Override
    public Gym createGym(Long gymGroupId, GymCreateDTO gymCreateDTO) {
        GymGroup gymGroup = gymGroupRepository.findById(gymGroupId)
                .orElseThrow(() -> new ResourceNotFoundException("Gym Group not found"));
        //gym dto object to gym
        Gym gym  = GymMapper.gymCreateDTOtoGym(gymCreateDTO);
        //include created at
        gym.setCreatedAt(LocalDateTime.now());
        //set the gym group id
        gym.setGymGroupId(gymGroupId);

        //save the gym and get gym id
        Gym savedGym =  gymRepository.save(gym);
        //create gym hours list with saved gym id
        List<GymHours> gymHoursList = gymCreateDTO.getGymHoursCreateDTOList().stream()
                .map(gymHoursCreateDTO -> {
                    GymHours gymHours = GymHoursMapper.gymHoursCreateDTOToGymHours(gymHoursCreateDTO);
                    //add created at
                    gymHours.setCreatedAt(LocalDateTime.now());
                    gymHours.setGymId(savedGym.getId());
                    return gymHours;
                }).collect(Collectors.toList());
        //save the gym hours in gym hours table
        List<GymHours> savedGymHoursList = gymHoursRepository.saveAll(gymHoursList);
        //include the gym hours in gym object
        savedGym.setGymHours(savedGymHoursList);
        return savedGym;
    }

    @Override
    public Gym getGymById(Long gymId) {
        return null;
    }

    @Override
    public List<Gym> getAllGymByGroupId(Long gymGroupId) {
        return null;
    }

    @Override
    public Gym updateGym(Long gymId, GymCreateDTO gymCreateDTO) {
        return null;
    }

    @Override
    public void deleteGym(Long gymId) {

    }
}
