package com.example.backendshelter.service;

import com.example.backendshelter.model.Pet;
import com.example.backendshelter.model.Shelter;
import com.example.backendshelter.repository.PetRepository;
import com.example.backendshelter.repository.ShelterRepository;

import java.util.ArrayList;
import java.util.List;

public class ShelterService {

    private final ShelterRepository shelterRepository;
    private final PetRepository petRepository;

    public ShelterService(ShelterRepository shelterRepository, PetRepository petRepository) {
        this.shelterRepository = shelterRepository;
        this.petRepository = petRepository;
    }

    public Shelter createShelter(Shelter newShelter) {
        return shelterRepository.save(newShelter);
    }

    public Shelter getShelterById(Long aLong) {
        return shelterRepository.getById(aLong);
    }

    //Creating a List<Pet> based in a List<Long> petIdList and saving it to the shelter
    public Shelter addPetsToShelter(Shelter getShelter, List<Long> petIdList) {
        List<Pet> petList = new ArrayList<>();
        for (Long i : petIdList) {
            petList.add(petRepository.getById(i));
        }
        getShelter.setPetList(petList);
        return shelterRepository.save(getShelter);
    }

    //Check if shelter exists
    public Shelter getShelterByName(String name) {
        List<Shelter> allShelters = shelterRepository.findAll();
        Shelter shelter;
        for (int i = 0; i < allShelters.size(); i++) {
            if (allShelters.get(i).getShelterName() == name)
                return allShelters.get(i);
        }
        return null;
    }

    //Delete by id
    public void deleteById(Long shelterId) {
        shelterRepository.deleteById(shelterId);
    }
}

