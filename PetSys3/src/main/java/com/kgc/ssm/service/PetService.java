package com.kgc.ssm.service;

import com.kgc.ssm.pojo.Pet;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-09-20 15:04
 */
public interface PetService {
    List<Pet> selectAllPet(Integer type);
    void addPet(Pet pet);

}
