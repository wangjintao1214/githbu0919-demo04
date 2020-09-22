package com.kgc.ssm.service.impl;

import com.kgc.ssm.mapper.PetMapper;
import com.kgc.ssm.pojo.Pet;
import com.kgc.ssm.pojo.PetExample;
import com.kgc.ssm.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-22 9:15
 */
@Service("petService")
public class PetServiceimpl implements PetService {
    @Resource
    PetMapper petMapper;
    @Override
    public List<Pet> selectByType(String type) {
        PetExample petExample = new PetExample();
        PetExample.Criteria criteria = petExample.createCriteria();
        if(type!=null){
            criteria.andPetBreedEqualTo(type);
        }
        List<Pet> pets = petMapper.selectByExample(petExample);
        return pets;
    }

    @Override
    public int addPet(Pet pet) {
        int i = petMapper.insertSelective(pet);
        return i;
    }
}
