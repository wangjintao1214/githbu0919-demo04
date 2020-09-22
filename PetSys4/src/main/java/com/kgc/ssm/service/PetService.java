package com.kgc.ssm.service;

import com.kgc.ssm.pojo.Pet;

import java.util.List;

public interface PetService {
    List<Pet> selectAll(Integer type);
    void add(Pet pet);
}
